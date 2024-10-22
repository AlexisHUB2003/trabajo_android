package fabian.stomas.aplicacion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "study.db";

    private static final int DATABASE_VERSION = 1;

    public MyDatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String createTable = "CREATE TABLE usuario(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT NOT NULL, apellido TEXT NOT NULL, telefono TEXT NOT NULL UNIQUE," +
                "correo TEXT NOT NULL UNIQUE, password NOT NULL)";
        db.execSQL(createTable);
        String create_canales = "CREATE TABLE canales(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT NOT NULL, descripcion TEXT, tipo_canal INTEGER," +
                "FOREIGN KEY (tipo_canal) REFERENCES tipo_canales(id))";
        db.execSQL(create_canales);
        String create_amigos = "CREATE TABLE amigos(id_usuario INTEGER PRIMARY KEY AUTOINCREMENT," +
                "id_amigo INTEGER PRIMARY KEY AUTOINCREMENT," +
                "FOREIGN KEY (id_usuario) REFERENCES usuario(id)," +
                "FOREIGN KEY (id_amigo) REFERENCES usuario(id))";
        db.execSQL(create_amigos);
        String create_usuarios_canales = "CREATE TABLE usuarios_canales(id_usuario INTEGER PRIMARY KEY AUTOINCREMENT," +
                "id_canal INTEGER PRIMARY KEY AUTOINCREMENT," +
                "FOREIGN KEY (id_usuario) REFERENCES usuario(id)," +
                "FOREIGN KEY (id_canal) REFERENCES canales(id))";
        db.execSQL(create_usuarios_canales);
        String create_tipo_canales = "CREATE TABLE tipo_canales(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT)";
        db.execSQL(create_tipo_canales);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS usuario");
        db.execSQL("DROP TABLE IF EXISTS canales");
        db.execSQL("DROP TABLE IF EXISTS amigos");
        db.execSQL("DROP TABLE IF EXISTS usuarios_canales");
        db.execSQL("DROP TABLE IF EXISTS tipo_canales");
        onCreate(db);
    }
}
