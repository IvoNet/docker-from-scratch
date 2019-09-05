FROM python:3.7.4-alpine3.10

WORKDIR /www
COPY site/index.html .

EXPOSE 3000
ENTRYPOINT ["python3", "-m", "http.server", "--bind", "0.0.0.0", "--directory", "/www", "3000"]
