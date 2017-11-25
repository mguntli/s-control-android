package ch.soreco.android.ui;

import android.content.Context;
import android.content.Intent;

import javax.inject.Inject;

import ch.soreco.android.ui.discovery.DiscoveryActivity;

/**
 * Created by sandro.pedrett on 25.11.2017.
 */
public class Navigator implements NavigatorIfc {
    private final Context context;

    @Inject
    public Navigator(Context context) {
        this.context = context;
    }

    @Override
    public void navigateToDiscoverScreen() {
        startIntent(DiscoveryActivity.class);
    }

    private <T> void startIntent(Class<T> clazz) {
        if (context != null) {
            startIntent(new Intent(context, clazz));
        }
    }

    private void startIntent(Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
