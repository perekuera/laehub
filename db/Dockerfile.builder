FROM postgres:latest    

LABEL maintainer="Pere Bestard <perekuera@gmail.com>"
LABEL version="1.0"
LABEL description="PostgreSQL database image"

ENV POSTGRES_DB=laedb \
    POSTGRES_DB_CHARSET=UTF-8 \
    TZ=Europe/Madrid

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ARG POSTGRES_USER \
    POSTGRES_PASSWORD

ENV POSTGRES_USER=${POSTGRES_USER} \
    POSTGRES_PASSWORD=${POSTGRES_PASSWORD}
    
COPY ./sql /docker-entrypoint-initdb.d/

EXPOSE 5432
