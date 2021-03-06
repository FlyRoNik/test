package ua.com.juja.sqlcmd.model;

/**
 * Created by FlyRoNik on 10.04.2016.
 */
public interface DatabaseManager {
    DataSet[] getTableData(String tableName);

    String[] getTablesNames();

    void connect(String database, String userName, String password);

    void clear(String tableName);

    void create(String tableName, DataSet input);

    void update(String tableName, int id, DataSet newValue);

    String[] getTablesColumns(String tableName);

    boolean isConnected();
}
