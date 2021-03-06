package com.improve.data.dao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.improve.data.bean.GreenFriend;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GREEN_FRIEND".
*/
public class GreenFriendDao extends AbstractDao<GreenFriend, String> {

    public static final String TABLENAME = "GREEN_FRIEND";

    /**
     * Properties of entity GreenFriend.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Fid = new Property(0, String.class, "fid", true, "FID");
        public final static Property Uid = new Property(1, String.class, "uid", false, "UID");
        public final static Property Fname = new Property(2, String.class, "fname", false, "FNAME");
    }

    private Query<GreenFriend> greenUser_FriendsQuery;

    public GreenFriendDao(DaoConfig config) {
        super(config);
    }
    
    public GreenFriendDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GREEN_FRIEND\" (" + //
                "\"FID\" TEXT PRIMARY KEY NOT NULL ," + // 0: fid
                "\"UID\" TEXT," + // 1: uid
                "\"FNAME\" TEXT);"); // 2: fname
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GREEN_FRIEND\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, GreenFriend entity) {
        stmt.clearBindings();
 
        String fid = entity.getFid();
        if (fid != null) {
            stmt.bindString(1, fid);
        }
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(2, uid);
        }
 
        String fname = entity.getFname();
        if (fname != null) {
            stmt.bindString(3, fname);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, GreenFriend entity) {
        stmt.clearBindings();
 
        String fid = entity.getFid();
        if (fid != null) {
            stmt.bindString(1, fid);
        }
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(2, uid);
        }
 
        String fname = entity.getFname();
        if (fname != null) {
            stmt.bindString(3, fname);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public GreenFriend readEntity(Cursor cursor, int offset) {
        GreenFriend entity = new GreenFriend( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // fid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // uid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // fname
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, GreenFriend entity, int offset) {
        entity.setFid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setUid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setFname(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final String updateKeyAfterInsert(GreenFriend entity, long rowId) {
        return entity.getFid();
    }
    
    @Override
    public String getKey(GreenFriend entity) {
        if(entity != null) {
            return entity.getFid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(GreenFriend entity) {
        return entity.getFid() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "friends" to-many relationship of GreenUser. */
    public List<GreenFriend> _queryGreenUser_Friends(String fid) {
        synchronized (this) {
            if (greenUser_FriendsQuery == null) {
                QueryBuilder<GreenFriend> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Fid.eq(null));
                greenUser_FriendsQuery = queryBuilder.build();
            }
        }
        Query<GreenFriend> query = greenUser_FriendsQuery.forCurrentThread();
        query.setParameter(0, fid);
        return query.list();
    }

}
