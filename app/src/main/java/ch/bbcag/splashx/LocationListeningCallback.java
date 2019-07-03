package ch.bbcag.splashx;

import android.location.Location;

import androidx.annotation.NonNull;

import com.mapbox.android.core.location.LocationEngineCallback;
import com.mapbox.android.core.location.LocationEngineResult;

import java.lang.ref.WeakReference;

public class LocationListeningCallback implements LocationEngineCallback<LocationEngineResult> {
    private final WeakReference<MapsActivity> activityWeakReference;
    private Location lastLocation;

    public LocationListeningCallback(MapsActivity activity) {
        this.activityWeakReference = new WeakReference<>(activity);
    }

    @Override
    public void onSuccess(LocationEngineResult result) {
        Location lastLocation = result.getLastLocation();
    }

    @Override
    public void onFailure(@NonNull Exception exception) {
        exception.printStackTrace();
    }

    public Location getLastLocation() {
        return lastLocation;
    }
}
