import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SysConfigTest {

    private SysConfig system;

    @BeforeEach
    public void setUp() {
        system = SysConfig.getSysConfig();
    }

    @Test
    public void testGetLanguageEnglish() {
        system.setLanguage("English");
        Assertions.assertEquals("English", system.getSysLanguage());
    }

    @Test
    public void testGetLanguagePortuguese() {
        system.setLanguage("Portuguese");
        Assertions.assertEquals("Português", system.getSysLanguage());
    }

    @Test
    public void testSetLanguageInexistenteMantemAnterior() {
        system.setLanguage("Spanish");
        Assertions.assertEquals("English", system.getSysLanguage());
    }

    @Test
    public void testGetLocaleCodeEnglish() {
        system.setLanguage("English");
        Assertions.assertEquals("en-US", system.getSysLanguageLocaleCode());
    }

    @Test
    public void testGetLocaleCodePortuguese() {
        system.setLanguage("Portuguese");
        Assertions.assertEquals("pt-BR", system.getSysLanguageLocaleCode());
    }

    @Test
    public void testGetThemeLight() {
        system.setTheme("LightTheme");
        Assertions.assertEquals("Light theme", system.getSysTheme());
    }

    @Test
    public void testGetThemeDark() {
        system.setTheme("DarkTheme");
        Assertions.assertEquals("Dark theme", system.getSysTheme());
    }

    @Test
    public void testSetThemeInexistenteMantemAnterior() {
        system.setTheme("LightTheme");
        system.setTheme("BlueTheme");
        Assertions.assertEquals("Light theme", system.getSysTheme());
    }

    @Test
    public void testGetBackgroundColorDark() {
        system.setTheme("DarkTheme");
        Assertions.assertEquals("#000000", system.getSysThemeBackgroundColor());
    }

    @Test
    public void testGetBackgroundColorLight() {
        system.setTheme("LightTheme");
        Assertions.assertEquals("#FFFFFF", system.getSysThemeBackgroundColor());
    }

    @Test
    public void testGetPrimaryColorDark() {
        system.setTheme("DarkTheme");
        Assertions.assertEquals("#FFFFFF", system.getSysThemePrimaryColor());
    }

    @Test
    public void testGetPrimaryColorLight() {
        system.setTheme("LightTheme");
        Assertions.assertEquals("#000000", system.getSysThemePrimaryColor());
    }
}