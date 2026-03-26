public class Portuguese implements Lang {
    private final String displayName = "Português";
    private final String localeCode = "pt-BR";

    private static final Portuguese portuguese = new Portuguese();

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    @Override
    public String getLocaleCode() {
        return this.localeCode;
    }

    public static Lang getPortuguese() {
        return Portuguese.portuguese;
    }
}
