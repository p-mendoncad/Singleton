class Main {
    public static void main(String[] args) {
        System.out.println(SysConfig.getSysConfig().getSysLanguage());
        System.out.println(SysConfig.getSysConfig().setLanguage("Portuguese"));
        System.out.println(SysConfig.getSysConfig().getSysLanguage());
        System.out.println(SysConfig.getSysConfig().setTheme("DarkTheme"));
        System.out.println(SysConfig.getSysConfig().getSysTheme());
    }
}
