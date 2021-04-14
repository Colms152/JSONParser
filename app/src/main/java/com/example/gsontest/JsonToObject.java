package com.example.gsontest;

import com.google.gson.Gson;

public class JsonToObject {


    public static Organisation getOrganisationObject()
    {
        // Storing preprocessed json(Added slashes)
        String OrganisationJson
                = "{\"organisation_name\" : \"GeeksforGeeks\",\"description\" : \"A computer Science portal for Geeks\",\"Employee\" : \"2000\"}";

        // Creating a Gson Object
        Gson gson = new Gson();

        // Converting json to object
        // first parameter should be prpreocessed json
        // and second should be mapping class
        Organisation organisation
                = gson.fromJson(OrganisationJson,
                Organisation.class);

        // return object
        return organisation;
    }

    public static Hero getHeroObject()
    {
        // Storing preprocessed json(Added slashes)
        String HeroJson
                = "{\"id\":369,\"name\":\"Spiderman Johnny\",\"realname\":\"Spiderman Johnny\",\"rating\":10,\"teamaffiliation\":\"Fantastic Four\"}";

        // Creating a Gson Object
        Gson gson = new Gson();

        // Converting json to object
        // first parameter should be prpreocessed json
        // and second should be mapping class
        Hero hero
                = gson.fromJson(HeroJson,
                Hero.class);

        // return object
        return hero;
    }
}