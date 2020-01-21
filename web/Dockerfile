FROM python:3.8.1-alpine3.11

WORKDIR /www
COPY site/index.html .

EXPOSE 3000
ENTRYPOINT ["python3", "-m", "http.server", "--bind", "0.0.0.0", "--directory", "/www", "3000"]
