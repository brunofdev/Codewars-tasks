package TakeAtenMinutesWalk;

import java.util.HashMap;
import java.util.Map;

public class TakeTenMinutesWalk {
    //minha solução
    public static boolean isValid(char[] walk) {
        if(walk.length != 10 ){
            return false;
        }
        Map<Character, Integer> cordenadas = new HashMap<>(Map.of(
                'n',0,
                's',0,
                'e',0,
                'w',0
        ));
        for(char c : walk){
            cordenadas.put(c, cordenadas.getOrDefault(c, 0) + 1);
        }
        if(!cordenadas.get('n').equals(cordenadas.get('s')) || !cordenadas.get('w').equals(cordenadas.get('e'))){
            return false;
        }
        return true;
    }

    //uma solução melhor:
    public static boolean isValid2(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int x = 0, y = 0;
        for (int i = 0; i < 10; i++) {
            switch (walk[i]) {
                case 'n':
                    y++;
                    break;
                case 'e':
                    x++;
                    break;
                case 's':
                    y--;
                    break;
                case 'w':
                    x--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
