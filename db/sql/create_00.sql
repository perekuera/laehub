CREATE SCHEMA IF NOT EXISTS lae;

-- Establecer el esquema de búsqueda
SET search_path TO lae;

-- Otorgar permisos al usuario
GRANT ALL PRIVILEGES ON SCHEMA lae TO ${POSTGRES_USER};
