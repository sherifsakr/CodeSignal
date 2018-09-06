package Arcade.Intro._11_LandOfLogic;

import java.util.ArrayList;
import java.util.List;

public class FileNaming {

    String[] fileNaming(String[] names) {
        List<String> files = new ArrayList<>();

        for(String name : names){
            if(!files.contains(name)){
                files.add(name);
            }else{
                for(int i = 1; i < 16; i++){
                    String newName = name + "(" + i + ")";
                    if(files.contains(newName))
                        continue;
                    else{
                        files.add(newName);
                        break;
                    }
                }
            }
        }

        names = files.toArray(new String[files.size()]);
        return files.toArray(names);
    }
}
