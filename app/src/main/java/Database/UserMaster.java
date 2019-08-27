package Database;

import android.provider.BaseColumns;

public final class UserMaster {

    private UserMaster(){}

    public static class Users implements BaseColumns{

        public static final String TABLE_NAME="users";
        public static final String COLUM_NAME_USERNAME="username";
        public static final String COLUM_NAME_PASSWORD="password";

    }

}
