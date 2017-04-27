package androidsimple.gaos.dependencyinjectionex.scope.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


import com.gaos.dependencyinjectionex.R;

import javax.inject.Inject;

import androidsimple.gaos.dependencyinjectionex.scope.App;
import androidsimple.gaos.dependencyinjectionex.scope.User;
import androidsimple.gaos.dependencyinjectionex.scope.UserNamed;
import androidsimple.gaos.dependencyinjectionex.scope.c.CActivity;

/**
 * Created by wanglj on 16/6/22.
 */

public class BActivity extends AppCompatActivity{
    @UserNamed("a")
    @Inject
    User userA;

    @UserNamed("b")
    @Inject
    User userB;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        App.get(this).getUserComponent().plus(new BModule()).inject(this);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("username:"+userA.getName()+"--user:"+userA+""+"username:"+userB.getName()+"--user:"+userB);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BActivity.this, CActivity.class));
            }
        });
    }


}
