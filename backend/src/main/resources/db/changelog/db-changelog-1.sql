-- liquibase formatted sql

-- changeset Syed_Ehtesham:1703354076369-1
CREATE TABLE "users" ("id" UUID NOT NULL, "age" INTEGER, "disability" VARCHAR(255), "email" VARCHAR(255) NOT NULL, "gender" VARCHAR(255), "goals" INTEGER, "location" VARCHAR(255), "full_name" VARCHAR(255), "password" VARCHAR(255) NOT NULL, "reliability" VARCHAR(255), "role" VARCHAR(255), "runs" INTEGER, CONSTRAINT "users_pkey" PRIMARY KEY ("id"));

-- changeset Syed_Ehtesham:1703354076369-2
ALTER TABLE "users" ADD CONSTRAINT "uk_6dotkott2kjsp8vw4d0m25fb7" UNIQUE ("email");

-- changeset Syed_Ehtesham:1703354076369-3
ALTER TABLE "users" ADD CONSTRAINT "uk_r53o2ojjw4fikudfnsuuga336" UNIQUE ("password");

-- changeset Syed_Ehtesham:1703354076369-4
CREATE TABLE "cricket_scorecard" ("id" UUID NOT NULL, "balls" BYTEA, "dots" BYTEA, "fours" BYTEA, "overs" BYTEA, "runs" BYTEA, "sixes" BYTEA, "toss" VARCHAR(255), "wickets" BYTEA, "wides" BYTEA, CONSTRAINT "cricket_scorecard_pkey" PRIMARY KEY ("id"));

-- changeset Syed_Ehtesham:1703354076369-5
CREATE TABLE "football_scorecard" ("id" UUID NOT NULL, "corners" BYTEA, "fouls" BYTEA, "goals" BYTEA, "timing" time(6) WITHOUT TIME ZONE, CONSTRAINT "football_scorecard_pkey" PRIMARY KEY ("id"));

-- changeset Syed_Ehtesham:1703354076369-6
CREATE TABLE "game" ("id" UUID NOT NULL, "date" date, "time" time(6) WITHOUT TIME ZONE, CONSTRAINT "game_pkey" PRIMARY KEY ("id"));

-- changeset Syed_Ehtesham:1703354076369-7
CREATE TABLE "organizers" ("id" UUID NOT NULL, "email" VARCHAR(255), "name" VARCHAR(255), "phone_number" VARCHAR(255), CONSTRAINT "organizers_pkey" PRIMARY KEY ("id"));

-- changeset Syed_Ehtesham:1703354076369-8
CREATE TABLE "reviews" ("id" UUID NOT NULL, "comment" VARCHAR(255), "rating" numeric(38, 2), CONSTRAINT "reviews_pkey" PRIMARY KEY ("id"));

-- changeset Syed_Ehtesham:1703354076369-9
CREATE TABLE "scorecard" ("id" UUID NOT NULL, CONSTRAINT "scorecard_pkey" PRIMARY KEY ("id"));

-- changeset Syed_Ehtesham:1703354076369-10
CREATE TABLE "team" ("id" UUID NOT NULL, "captain" VARCHAR(255), "coach" VARCHAR(255), "team_name" VARCHAR(255), "total_matches_played" BYTEA, CONSTRAINT "team_pkey" PRIMARY KEY ("id"));

-- changeset Syed_Ehtesham:1703354076369-11
CREATE TABLE "venue" ("id" UUID NOT NULL, "capacity" BYTEA, "games_hosted" BYTEA, "location" VARCHAR(255), "venue_name" VARCHAR(255), CONSTRAINT "venue_pkey" PRIMARY KEY ("id"));

