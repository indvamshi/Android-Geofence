package com.example.android.geofence.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteHelper extends SQLiteOpenHelper {

	// Database Version
    private static final int DATABASE_VERSION = 1;
    
    // Database Name
    private static final String DATABASE_NAME = "GeofenceDb";
    
    // geofence table name
    private static final String TABLE_GEOFENCE = "geofence";
 
    // Books Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_LONGITUDE = "title";
    private static final String KEY_LATITUDE = "author";
    private static final String KEY_EXPIRY = "author";
    private static final String KEY_RADIUS = "author";
    private static final String KEY_SHORTMESSAGE = "author";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);  
    }
 
	@Override
	public void onCreate(SQLiteDatabase db) {
        // SQL statement to create book table
        String CREATE_GEOFENCE_TABLE = "CREATE TABLE geofence ( " +
                "id TEXT PRIMARY KEY, " + 
                "longitude REAL, "+
                "latitude REAL,  "+
                "expiryTime NUMERIC," +
                "radius REAL," +
                "shortMessage TEXT)";
        
        db.execSQL(CREATE_GEOFENCE_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	    // Drop older books table if existed
        db.execSQL("DROP TABLE IF EXISTS geofence");
 
        // create fresh books table
        this.onCreate(db);

	}
	
	public void addGeofence(Geofence geofence) {
		
	}

}
