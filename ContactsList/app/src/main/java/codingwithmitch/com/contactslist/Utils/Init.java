package codingwithmitch.com.contactslist.Utils;

import android.Manifest;

/**
 * Created by User on 6/12/2017.
 */

public class Init {

    public Init() {
    }

    public static final String[] PERMISSIONS = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA};

    public static final String[] PHONE_PERMISSIONS = {Manifest.permission.CALL_PHONE};
}
