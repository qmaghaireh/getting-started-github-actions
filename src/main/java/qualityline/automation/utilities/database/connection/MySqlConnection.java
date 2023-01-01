package qualityline.automation.utilities.database.connection;

import qualityline.automation.utilities.database.DatabaseType;
import qualityline.automation.utilities.helpers.ConfigKey;
import qualityline.automation.utilities.helpers.config.CommonConfigReader;


/** @author Qasim Maghaireh */
public class MySqlConnection extends DatabaseConnection {

  public MySqlConnection() {
    super(DatabaseType.MYSQL);
  }

  @Override
  protected String getUrl() {
    return CommonConfigReader.getInstance().getPropValue(ConfigKey.MYSQL_DATABASE_URL);
  }

  @Override
  protected String getUsername() {
    return CommonConfigReader.getInstance().getPropValue(ConfigKey.MYSQL_DATABASE_USERNAME);
  }

  @Override
  protected String getPassword() {
    return CommonConfigReader.getInstance().getPropValue(ConfigKey.MYSQL_DATABASE_PASSWORD);
  }
}
