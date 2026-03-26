public class LightTheme implements Theme{
    private final String primaryColor = "#000000";
    private final String backgroundColor = "#FFFFFF";
    private final String themeName = "Light theme";

    private static final LightTheme lightTheme = new LightTheme();

    @Override
    public String getPrimaryColor() {
        return this.primaryColor;
    }

    @Override
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override
    public String getThemeName() {
        return this.themeName;
    }

    public static Theme getLightTheme() {
        return LightTheme.lightTheme;
    }
}
