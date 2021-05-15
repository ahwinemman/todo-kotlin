CREATE TABLE IF NOT EXISTS todo (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  item                   VARCHAR      NOT NULL
);