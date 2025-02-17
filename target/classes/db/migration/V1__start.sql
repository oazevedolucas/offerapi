CREATE TABLE IF NOT EXISTS "offer" (
	"id" bigint NOT NULL,
	"description" VARCHAR(88) NULL DEFAULT NULL,
	"value" NUMERIC(10,2) NOT NULL,
	"amount" bigint NOT NULL,
	"date_time" TIMESTAMP NULL DEFAULT NULL,
	PRIMARY KEY ("id")
);