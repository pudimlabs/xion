# Xion Project

This project utilizes the Cosmos SDK to build a blockchain application. Below is a description of the commands available
in the Makefile.

## Table of Contents

- [Installation](#installation)
- [Build](#build)
- [Docker Build](#docker-build)
- [Testing](#testing)
- [Tools & Dependencies](#tools--dependencies)
- [Linting](#linting)
- [Protobuf](#protobuf)
- [Cleaning](#cleaning)

## Installation

To install the 'xiond' binary:

```
make install
```

## Build

To build the project:

```
make build
```

You can also build for different platforms and architectures:

```
make build-linux-arm64
make build-linux-amd64
make build-darwin-arm64
make build-darwin-amd64
```

## Docker Build

To build Docker images for different platforms:

```
make build-docker
make build-docker-amd64
make build-docker-arm64
```

For testing purposes, you can also build a 'heighliner' Docker image:

```
make build-heighliner
make build-heighliner-amd64
make build-heighliner-arm64
```

## Testing

There are various test targets available:

- `make test` - Run unit tests
- `make test-all` - Run all tests including unit, race, and coverage
- `make test-unit` - Run unit tests
- `make test-integration` - Run integration tests
- `make test-race` - Run tests with race condition detection
- `make test-cover` - Run tests with coverage
- `make benchmark` - Run benchmarks

## Specific Integration Tests

You can run specific integration tests by using the following commands:

```
make test-integration-dungeon-transfer-block
make test-integration-mint-module-no-inflation-no-fees
make test-integration-mint-module-inflation-high-fees
make test-integration-mint-module-inflation-low-fees
make test-integration-jwt-abstract-account
make test-integration-register-jwt-abstract-account
make test-integration-xion-send-platform-fee
make test-integration-xion-abstract-account
make test-integration-xion-min-default
make test-integration-xion-min-zero
make test-integration-xion-token-factory
make test-integration-xion-treasury-grants
make test-integration-simulate
```

## Tools & Dependencies

To ensure all Go modules are downloaded:

```
make go-mod-cache
```

To verify dependencies:

```
make go.sum
```

To draw dependencies graph (requires Graphviz):

```
make draw-deps
```

## Linting

To format and lint the code:

```
make format
```

To just lint the code:

```
make lint
```

## Protobuf

To generate protobuf files:

```
make proto-gen
```

To format protobuf files:

```
make proto-format
```

To lint protobuf files:

```
make proto-lint
```

To check for breaking changes in protobuf files:

```
make proto-check-breaking
```

## Cleaning

To clean build artifacts:

```
make clean
```

To perform a full clean including vendor directory:

```
make distclean
```

## Additional Information

- The Makefile includes various other targets such as 'build-all', 'release-dryrun', and more for cross-platform builds
  and releases.
- The project uses Docker and Goreleaser for automated cross-platform builds.
- The build process considers support for different environments and optional features like Ledger support.

For more detailed usage, refer to the individual make targets in the Makefile.

```: