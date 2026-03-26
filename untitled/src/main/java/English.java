public class English implements Lang {
    private final String displayName = "English";
    private final String localeCode = "en-US";

    private static final English english = new English();

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    @Override
    public String getLocaleCode() {
        return this.localeCode;
    }

    public static Lang getEnglish() {
        return English.english;
    }
}
