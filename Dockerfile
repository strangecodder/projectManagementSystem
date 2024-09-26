FROM postgres
USER root
LABEL authors="artemdemidov"

ARG POSTGRES_USER=postgres
ARG POSTGRES_PASSWORD=postgres
ARG POSTGRES_DB=pms

ENV POSTGRES_USER=${POSTGRES_USER}
ENV POSTGRES_PASSWORD=${POSTGRES_PASSWORD}
ENV POSTGRES_DB=${POSTGRES_DB}

VOLUME postgres-data:/var/lib/postgresql/data

HEALTHCHECK CMD "CMD-SHELL", "pg_isready", "-d", "db_prod"

USER postgres