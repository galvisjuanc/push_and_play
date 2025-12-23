INSERT INTO play_push_movies (title, duration, genre, clasificacion, release_date, state) VALUES ('Shrek', 90, 'ANIMADA', NULL, '2024-06-01', 'D') ON CONFLICT (title) DO NOTHING;

INSERT INTO play_push_movies (title, duration, genre, clasificacion, release_date, state) VALUES ('Inception', 148, 'CIENCIA_FICCION', NULL, '2010-07-16', 'D') ON CONFLICT (title) DO NOTHING;