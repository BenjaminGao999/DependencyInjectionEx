package androidsimple.gaos.dependencyinjectionex.scope;

import androidsimple.gaos.dependencyinjectionex.scope.a.AComponent;
import androidsimple.gaos.dependencyinjectionex.scope.a.AModule;
import androidsimple.gaos.dependencyinjectionex.scope.b.BComponent;
import androidsimple.gaos.dependencyinjectionex.scope.b.BModule;
import androidsimple.gaos.dependencyinjectionex.scope.c.CComponent;
import androidsimple.gaos.dependencyinjectionex.scope.c.CModule;
import dagger.Subcomponent;

/**
 * Created by wanglj on 16/6/22.
 */
@UserScope
@Subcomponent(modules = UserModule.class)
public interface UserComponent {
    AComponent plus(AModule aModule);

    BComponent plus(BModule bModule);

    CComponent plus(CModule cModule);
}
