package androidsimple.gaos.dependencyinjectionex.scope.c;


import dagger.Subcomponent;

/**
 * Created by wanglj on 16/6/22.
 */
@Subcomponent(modules = CModule.class)
public interface CComponent {
    void inject(CActivity cActivity);
}
