// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.5.1
// - protoc             (unknown)
// source: xion/jwk/v1/query.proto

package jwkv1

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.64.0 or later.
const _ = grpc.SupportPackageIsVersion9

const (
	Query_Params_FullMethodName        = "/xion.jwk.v1.Query/Params"
	Query_AudienceClaim_FullMethodName = "/xion.jwk.v1.Query/AudienceClaim"
	Query_Audience_FullMethodName      = "/xion.jwk.v1.Query/Audience"
	Query_AudienceAll_FullMethodName   = "/xion.jwk.v1.Query/AudienceAll"
	Query_ValidateJWT_FullMethodName   = "/xion.jwk.v1.Query/ValidateJWT"
)

// QueryClient is the client API for Query service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
//
// Query defines the gRPC querier service.
type QueryClient interface {
	// Parameters queries the parameters of the module.
	Params(ctx context.Context, in *QueryParamsRequest, opts ...grpc.CallOption) (*QueryParamsResponse, error)
	AudienceClaim(ctx context.Context, in *QueryGetAudienceClaimRequest, opts ...grpc.CallOption) (*QueryGetAudienceClaimResponse, error)
	// Queries a list of Audience items.
	Audience(ctx context.Context, in *QueryGetAudienceRequest, opts ...grpc.CallOption) (*QueryGetAudienceResponse, error)
	AudienceAll(ctx context.Context, in *QueryAllAudienceRequest, opts ...grpc.CallOption) (*QueryAllAudienceResponse, error)
	// Queries a list of ValidateJWT items.
	ValidateJWT(ctx context.Context, in *QueryValidateJWTRequest, opts ...grpc.CallOption) (*QueryValidateJWTResponse, error)
}

type queryClient struct {
	cc grpc.ClientConnInterface
}

func NewQueryClient(cc grpc.ClientConnInterface) QueryClient {
	return &queryClient{cc}
}

func (c *queryClient) Params(ctx context.Context, in *QueryParamsRequest, opts ...grpc.CallOption) (*QueryParamsResponse, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(QueryParamsResponse)
	err := c.cc.Invoke(ctx, Query_Params_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *queryClient) AudienceClaim(ctx context.Context, in *QueryGetAudienceClaimRequest, opts ...grpc.CallOption) (*QueryGetAudienceClaimResponse, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(QueryGetAudienceClaimResponse)
	err := c.cc.Invoke(ctx, Query_AudienceClaim_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *queryClient) Audience(ctx context.Context, in *QueryGetAudienceRequest, opts ...grpc.CallOption) (*QueryGetAudienceResponse, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(QueryGetAudienceResponse)
	err := c.cc.Invoke(ctx, Query_Audience_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *queryClient) AudienceAll(ctx context.Context, in *QueryAllAudienceRequest, opts ...grpc.CallOption) (*QueryAllAudienceResponse, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(QueryAllAudienceResponse)
	err := c.cc.Invoke(ctx, Query_AudienceAll_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *queryClient) ValidateJWT(ctx context.Context, in *QueryValidateJWTRequest, opts ...grpc.CallOption) (*QueryValidateJWTResponse, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(QueryValidateJWTResponse)
	err := c.cc.Invoke(ctx, Query_ValidateJWT_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// QueryServer is the server API for Query service.
// All implementations must embed UnimplementedQueryServer
// for forward compatibility.
//
// Query defines the gRPC querier service.
type QueryServer interface {
	// Parameters queries the parameters of the module.
	Params(context.Context, *QueryParamsRequest) (*QueryParamsResponse, error)
	AudienceClaim(context.Context, *QueryGetAudienceClaimRequest) (*QueryGetAudienceClaimResponse, error)
	// Queries a list of Audience items.
	Audience(context.Context, *QueryGetAudienceRequest) (*QueryGetAudienceResponse, error)
	AudienceAll(context.Context, *QueryAllAudienceRequest) (*QueryAllAudienceResponse, error)
	// Queries a list of ValidateJWT items.
	ValidateJWT(context.Context, *QueryValidateJWTRequest) (*QueryValidateJWTResponse, error)
	mustEmbedUnimplementedQueryServer()
}

// UnimplementedQueryServer must be embedded to have
// forward compatible implementations.
//
// NOTE: this should be embedded by value instead of pointer to avoid a nil
// pointer dereference when methods are called.
type UnimplementedQueryServer struct{}

func (UnimplementedQueryServer) Params(context.Context, *QueryParamsRequest) (*QueryParamsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Params not implemented")
}
func (UnimplementedQueryServer) AudienceClaim(context.Context, *QueryGetAudienceClaimRequest) (*QueryGetAudienceClaimResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AudienceClaim not implemented")
}
func (UnimplementedQueryServer) Audience(context.Context, *QueryGetAudienceRequest) (*QueryGetAudienceResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Audience not implemented")
}
func (UnimplementedQueryServer) AudienceAll(context.Context, *QueryAllAudienceRequest) (*QueryAllAudienceResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AudienceAll not implemented")
}
func (UnimplementedQueryServer) ValidateJWT(context.Context, *QueryValidateJWTRequest) (*QueryValidateJWTResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ValidateJWT not implemented")
}
func (UnimplementedQueryServer) mustEmbedUnimplementedQueryServer() {}
func (UnimplementedQueryServer) testEmbeddedByValue()               {}

// UnsafeQueryServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to QueryServer will
// result in compilation errors.
type UnsafeQueryServer interface {
	mustEmbedUnimplementedQueryServer()
}

func RegisterQueryServer(s grpc.ServiceRegistrar, srv QueryServer) {
	// If the following call pancis, it indicates UnimplementedQueryServer was
	// embedded by pointer and is nil.  This will cause panics if an
	// unimplemented method is ever invoked, so we test this at initialization
	// time to prevent it from happening at runtime later due to I/O.
	if t, ok := srv.(interface{ testEmbeddedByValue() }); ok {
		t.testEmbeddedByValue()
	}
	s.RegisterService(&Query_ServiceDesc, srv)
}

func _Query_Params_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryParamsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueryServer).Params(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: Query_Params_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueryServer).Params(ctx, req.(*QueryParamsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Query_AudienceClaim_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryGetAudienceClaimRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueryServer).AudienceClaim(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: Query_AudienceClaim_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueryServer).AudienceClaim(ctx, req.(*QueryGetAudienceClaimRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Query_Audience_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryGetAudienceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueryServer).Audience(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: Query_Audience_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueryServer).Audience(ctx, req.(*QueryGetAudienceRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Query_AudienceAll_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryAllAudienceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueryServer).AudienceAll(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: Query_AudienceAll_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueryServer).AudienceAll(ctx, req.(*QueryAllAudienceRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Query_ValidateJWT_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryValidateJWTRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueryServer).ValidateJWT(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: Query_ValidateJWT_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueryServer).ValidateJWT(ctx, req.(*QueryValidateJWTRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// Query_ServiceDesc is the grpc.ServiceDesc for Query service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var Query_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "xion.jwk.v1.Query",
	HandlerType: (*QueryServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Params",
			Handler:    _Query_Params_Handler,
		},
		{
			MethodName: "AudienceClaim",
			Handler:    _Query_AudienceClaim_Handler,
		},
		{
			MethodName: "Audience",
			Handler:    _Query_Audience_Handler,
		},
		{
			MethodName: "AudienceAll",
			Handler:    _Query_AudienceAll_Handler,
		},
		{
			MethodName: "ValidateJWT",
			Handler:    _Query_ValidateJWT_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "xion/jwk/v1/query.proto",
}
