package Arcade.Intro._05_RainsOfReason;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableName {

    boolean variableName(String name) {
        if (name.substring(0, 1).matches("[0-9]"))
            return false;

        Matcher m = Pattern.compile("^[a-zA-Z0-9_]+").matcher(name);

        if (!m.matches()) return false;

        return true;
    }

}
