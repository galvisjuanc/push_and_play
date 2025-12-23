INSERT INTO play_push_movies (title, duration, genre, clasificacion, release_date, state) VALUES ('Shrek', 90, 'ANIMADA', NULL, '2024-06-01', 'D') ON CONFLICT (title) DO NOTHING;

INSERT INTO play_push_movies (title, duration, genre, clasificacion, release_date, state) VALUES ('Inception', 148, 'CIENCIA_FICCION', NULL, '2010-07-16', 'D') ON CONFLICT (title) DO NOTHING;

INSERT INTO play_push_movies (title, duration, genre, clasificacion, release_date, state) VALUES ('Titanic', 195, 'DRAMA', 4.6, '1997-12-19', 'D') ON CONFLICT (titulo) DO NOTHING;

INSERT INTO play_push_movies (title, duration, genre, clasificacion, release_date, state) VALUES ('John Wick', 101, 'ACCION', NULL, '2014-10-24', 'D') ON CONFLICT (titulo) DO NOTHING;

INSERT INTO play_push_movies (title, duration, genre, clasificacion, release_date, state) VALUES ('El Conjuro', 112, 'TERROR', 3.0, '2013-07-19', 'D') ON CONFLICT (titulo) DO NOTHING;