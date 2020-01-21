FROM golang:1.13.6-alpine3.11 as builder
WORKDIR /
COPY hello-world.go /hello-world.go
RUN go build hello-world.go

FROM scratch
COPY --from=builder /hello-world /hello-world
CMD ["/hello-world"]
