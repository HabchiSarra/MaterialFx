package com.guigarage.sdk.util;

/**
 * Created by hendrikebbers on 12.03.15.
 */
public enum FontAwesomeIcons implements FontBasedIcon {
    ANGLE_LEFT("\uf104"),
    ANGLE_RIGHT("\uf105"),
    CALENDAR("\uf073"),
    COGS("\uf085"),
    PLUS("\uf067"),
    MAIL("\uf003"),
    NAV("\uf0c9"),
    PHONE("\uf095"),
    TABLE("\uf0ce"),
    VOLUMNE_DOWN("\uf103"),
    VOLUMNE_UP("\uf102"),
    SEARCH("\uf002"),
    STATS("\uf080"),
    LISTE("\uf009"),
    LIST("\uf0ca"),
    TRESHOLDS("\uf160"),
    INFO("\uf016");

    private String text;

    FontAwesomeIcons(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return getText();
    }
}