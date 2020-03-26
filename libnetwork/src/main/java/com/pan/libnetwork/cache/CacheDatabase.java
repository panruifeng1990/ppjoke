package com.pan.libnetwork.cache;

import com.pan.libcommon.AppGlobals;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * @author panruifeng
 * @date 2020/3/25.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
@Database(entities = {Cache.class},version = 1,exportSchema = true)
public abstract class CacheDatabase extends RoomDatabase {
    private static final CacheDatabase dataBase;

    static {
        //创建一个内存数据库
        //但是这种数据库的数据只存在于内存中，也就是进程被杀之后，数据就丢失
//        Room.inMemoryDatabaseBuilder()
        dataBase = Room.databaseBuilder(AppGlobals.getApplication(), CacheDatabase.class, "ppjoke_cache")
                //是否允许在主线程查询
                .allowMainThreadQueries()
                //数据库创建和打开后的回调
                //.addCallback();
                //设置查询的线程池
                //.setQueryExecutor()
                //.openHelperFactory()
                //room的日至模式
                //.setJournalMode()
                //数据库升级异常之后的回滚
                //.fallbackToDestructiveMigration()
                //数据库升级异常后根据指定版本进行回滚
                //.fallbackToDestructiveMigrationFrom()
//                .addMigrations(CacheDatabase.migration)
                .build();
    }

    public abstract CacheDao getCache();
    public static CacheDatabase get() {
        return dataBase;
    }

//    static Migration migration = new Migration(1,3) {
//        @Override
//        public void migrate(@NonNull SupportSQLiteDatabase database) {
//            database.execSQL("alter table teacher rename to student");
//            database.execSQL("alter table teacher add column teacher_age INTEGER NOT NULL default 0");
//        }
//    };
}
