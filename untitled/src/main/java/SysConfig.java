public class SysConfig{
    protected SysConfig(){};

    protected static final SysConfig sysConfig = new SysConfig();

    public static SysConfig getSysConfig(){
        return SysConfig.sysConfig;
    }

    private Lang language = new English();
    private Theme theme = new LightTheme();

    public String getSysLanguage() {
        return this.language.getDisplayName();
    }

    public String getSysLanguageLocaleCode() {
        return this.language.getLocaleCode();
    }

    public SysConfig setLanguage(String langClassName) {
        try {
            Class<?> clazz = Class.forName(langClassName);
            java.lang.reflect.Method method = clazz.getDeclaredMethod("get"+langClassName);
            this.language = (Lang) method.invoke(null);
        }
        catch (Exception e) {
        System.err.println("Error at loading language by Reflection: " + e.getMessage());
    }
    return this;
    }

    public String getSysTheme() {
        return this.theme.getThemeName();
    }

    public String getSysThemeBackgroundColor() {
        return this.theme.getBackgroundColor();
    }

    public String getSysThemePrimaryColor() {
        return this.theme.getPrimaryColor();
    }

    public SysConfig setTheme(String themeClassName) {
        try {
            Class<?> clazz = Class.forName(themeClassName);
            java.lang.reflect.Method method = clazz.getDeclaredMethod("get"+themeClassName);
            this.theme = (Theme) method.invoke(null);
        }
        catch (Exception e) {
            System.err.println("Error at loading theme by Reflection: " + e.getMessage());
        }
        return this;
    }
}