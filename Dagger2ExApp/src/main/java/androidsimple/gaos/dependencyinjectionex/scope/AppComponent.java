package androidsimple.gaos.dependencyinjectionex.scope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wanglj on 16/6/22.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    UserComponent plus(UserModule userModule);
}
