-- liquibase formatted sql

-- changeset kevin:1646471685923-1
CREATE TABLE "contact"
(
    "id"                  BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    "cell_phone_number"   VARCHAR(255),
    "email"               VARCHAR(255),
    "extra_shit"          VARCHAR(255),
    "family_name"         VARCHAR(255),
    "first_name"          VARCHAR(255),
    "home_phone_number"   VARCHAR(255),
    "notes"               VARCHAR(255),
    "office_phone_number" VARCHAR(255),
    "work_phone_number"   VARCHAR(255),
    CONSTRAINT "contact_pkey" PRIMARY KEY ("id")
);

-- changeset kevin:1646471685923-2
CREATE TABLE "course"
(
    "id"          BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    "description" VARCHAR(255),
    "name"        VARCHAR(255),
    CONSTRAINT "course_pkey" PRIMARY KEY ("id")
);

-- changeset kevin:1646471685923-3
CREATE TABLE "course_term"
(
    "id"          BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    "description" VARCHAR(255),
    "notes"       VARCHAR(255),
    "end_date"    date,
    "start_date"  date,
    "course_id"   BIGINT                                  NOT NULL,
    CONSTRAINT "course_term_pkey" PRIMARY KEY ("id")
);

-- changeset kevin:1646471685923-4
CREATE TABLE "folder"
(
    "id"            BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    "date_created"  date,
    "description"   VARCHAR(255),
    "last_accessed" date,
    "name"          VARCHAR(255),
    "notes"         VARCHAR(255),
    CONSTRAINT "folder_pkey" PRIMARY KEY ("id")
);

-- changeset kevin:1646471685923-5
CREATE TABLE "instructor"
(
    "id"           BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    "address"      VARCHAR(255),
    "full_name"    VARCHAR(255),
    "phone_number" VARCHAR(255),
    CONSTRAINT "instructor_pkey" PRIMARY KEY ("id")
);

-- changeset kevin:1646471685923-6
CREATE TABLE "registration"
(
    "id"         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    "expired"    BOOLEAN,
    "local_date" date,
    "student_id" BIGINT                                  NOT NULL,
    CONSTRAINT "registration_pkey" PRIMARY KEY ("id")
);

-- changeset kevin:1646471685923-7
CREATE TABLE "school"
(
    "id"             BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    "address_city"   VARCHAR(255),
    "address_street" VARCHAR(255),
    "contact_name"   VARCHAR(255),
    "contact_phone"  VARCHAR(255),
    "name"           VARCHAR(255),
    "notes"          VARCHAR(255),
    CONSTRAINT "school_pkey" PRIMARY KEY ("id")
);

-- changeset kevin:1646471685923-8
CREATE TABLE "student"
(
    "id"                BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    "active"            BOOLEAN                                 NOT NULL,
    "cell_phone_number" VARCHAR(255),
    "date_of_birth"     VARCHAR(255),
    "email"             VARCHAR(255),
    "family_name"       VARCHAR(255),
    "first_name"        VARCHAR(255),
    "home_phone_number" VARCHAR(255),
    "notes"             VARCHAR(255),
    CONSTRAINT "student_pkey" PRIMARY KEY ("id")
);

-- changeset kevin:1646471685923-9
CREATE TABLE "course_term_enrollment"
(
    "student_id"     BIGINT NOT NULL,
    "course_term_id" BIGINT NOT NULL,
    CONSTRAINT "course_term_enrollment_pkey" PRIMARY KEY ("student_id", "course_term_id")
);

-- changeset kevin:1646471685923-10
ALTER TABLE "course"
    ADD CONSTRAINT "uk_4xqvdpkafb91tt3hsb67ga3fj" UNIQUE ("name");

-- changeset kevin:1646471685923-11
ALTER TABLE "course_term_enrollment"
    ADD CONSTRAINT "uk_r0y0hw7lkbb1t5l83ubll99bu" UNIQUE ("course_term_id");

-- changeset kevin:1646471685923-12
CREATE SEQUENCE IF NOT EXISTS "hibernate_sequence" AS bigint START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset kevin:1646471685923-13
CREATE TABLE "school_term"
(
    "school_id"       BIGINT NOT NULL,
    "student_id"      BIGINT NOT NULL,
    "term_end_date"   date,
    "term_start_date" date,
    CONSTRAINT "school_term_pkey" PRIMARY KEY ("school_id", "student_id")
);

-- changeset kevin:1646471685923-14
CREATE TABLE "student_contact"
(
    "student_id" BIGINT NOT NULL,
    "contact_id" BIGINT NOT NULL,
    CONSTRAINT "student_contact_pkey" PRIMARY KEY ("student_id", "contact_id")
);

-- changeset kevin:1646471685923-15
CREATE TABLE "student_folders"
(
    "students_id" BIGINT NOT NULL,
    "folders_id"  BIGINT NOT NULL,
    CONSTRAINT "student_folders_pkey" PRIMARY KEY ("students_id", "folders_id")
);

-- changeset kevin:1646471685923-16
CREATE TABLE "users"
(
    "id" VARCHAR(255) NOT NULL,
    CONSTRAINT "users_pkey" PRIMARY KEY ("id")
);

-- changeset kevin:1646471685923-17
ALTER TABLE "course_term_enrollment"
    ADD CONSTRAINT "fk193il0ncac4arb347y7bri5p0" FOREIGN KEY ("student_id") REFERENCES "student" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset kevin:1646471685923-18
ALTER TABLE "student_folders"
    ADD CONSTRAINT "fk26culbdcs4gdcxea3u57kh1yi" FOREIGN KEY ("folders_id") REFERENCES "folder" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset kevin:1646471685923-19
ALTER TABLE "student_folders"
    ADD CONSTRAINT "fk73x9b51g6r6ajlwpsa9v47oee" FOREIGN KEY ("students_id") REFERENCES "student" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset kevin:1646471685923-20
ALTER TABLE "registration"
    ADD CONSTRAINT "fkcxvegulu1x4mjcvy3116tu5xu" FOREIGN KEY ("student_id") REFERENCES "student" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset kevin:1646471685923-21
ALTER TABLE "student_contact"
    ADD CONSTRAINT "fkfst735vouuiw0hwg6bp60ov3b" FOREIGN KEY ("student_id") REFERENCES "student" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset kevin:1646471685923-22
ALTER TABLE "school_term"
    ADD CONSTRAINT "fkguyrftljgvrxxer4nren4tqff" FOREIGN KEY ("school_id") REFERENCES "school" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset kevin:1646471685923-23
ALTER TABLE "student_contact"
    ADD CONSTRAINT "fkld2el3os77gw9yakhlss3ddn1" FOREIGN KEY ("contact_id") REFERENCES "contact" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset kevin:1646471685923-24
ALTER TABLE "school_term"
    ADD CONSTRAINT "fknp3ahlhs4kda6yd1d0dhtut40" FOREIGN KEY ("student_id") REFERENCES "student" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset kevin:1646471685923-25
ALTER TABLE "course_term"
    ADD CONSTRAINT "fkr6jo86ns94bdflsknauem0re2" FOREIGN KEY ("course_id") REFERENCES "course" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;

-- changeset kevin:1646471685923-26
ALTER TABLE "course_term_enrollment"
    ADD CONSTRAINT "fkv2mq12jheyytx05ytsqhtfku" FOREIGN KEY ("course_term_id") REFERENCES "course_term" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;
