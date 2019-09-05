FROM golang:1.12.9-alpine3.9 as builder
WORKDIR /
COPY hello-world.go /hello-world.go
RUN go build hello-world.go

FROM scratch
COPY --from=builder /hello-world /hello-world
CMD ["/hello-world"]
