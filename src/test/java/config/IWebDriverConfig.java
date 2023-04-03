package config;
import org.aeonbits.owner.Config;

@Config.Sources({
          "classpath:${env}.properties"
  })
  public interface IWebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://alfabank.ru/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();
  }

