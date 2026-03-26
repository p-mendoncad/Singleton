public class DarkTheme implements Theme{
    private final String primaryColor = "#FFFFFF";
    private final String backgroundColor = "#000000";
    private final String themeName = "Dark theme";

    private static final DarkTheme darkTheme = new DarkTheme();

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

    public static Theme getDarkTheme() {
        return DarkTheme.darkTheme;
    }
}
