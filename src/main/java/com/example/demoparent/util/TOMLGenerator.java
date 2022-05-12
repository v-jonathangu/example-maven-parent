package com.example.demoparent.util;

import java.util.Map;

import com.moandjiezana.toml.Toml;
import com.moandjiezana.toml.TomlWriter;

/**
 * Example of a class in the parent project.
 * in this example it generates a TOML file.
 * from a hashmap of key-value pairs.
 */
public class TOMLGenerator {
    private Map<String, String> map;

    public TOMLGenerator(Map<String, String> map) {
        this.map = map;
    }

    public Toml generateTOML() {
        TomlWriter tomlWriter = new TomlWriter();
        String tomlString = tomlWriter.write(map);
        return new Toml().read(tomlString);
    }

    @Override
    public String toString() {
        String toml = new TomlWriter().write(generateTOML());
        return toml;
    }

}