package ch.soreco.android.di;

import ch.soreco.android.ui.discovery.DiscoveryActivity;
import ch.soreco.android.ui.discovery.DiscoveryModule;
import ch.soreco.android.ui.startup.StartupActivity;
import ch.soreco.android.ui.startup.StartupModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by sandro.pedrett on 20.11.2017.
 */
@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = StartupModule.class)
    abstract StartupActivity startupActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = DiscoveryModule.class)
    abstract DiscoveryActivity discoveryActivity();
}
