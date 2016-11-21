package com.luczkow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by chris luczkow on 11/20/2016.
 */
class Amps {

    private List<String> amps;

    Amps(String file) throws Exception {

        amps = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            amps.add(line);
        }
    }

    String rnd() {

        Random random = new Random();
        return amps.get(random.nextInt(amps.size()));
    }
}
