// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: xion/v1/query.proto

package types

import (
	context "context"
	fmt "fmt"
	grpc1 "github.com/cosmos/gogoproto/grpc"
	proto "github.com/cosmos/gogoproto/proto"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	io "io"
	math "math"
	math_bits "math/bits"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.GoGoProtoPackageIsVersion3 // please upgrade the proto package

type QueryWebAuthNVerifyRegisterRequest struct {
	Addr      string `protobuf:"bytes,1,opt,name=addr,proto3" json:"addr,omitempty"`
	Challenge string `protobuf:"bytes,2,opt,name=challenge,proto3" json:"challenge,omitempty"`
	Rp        string `protobuf:"bytes,3,opt,name=rp,proto3" json:"rp,omitempty"`
	Data      []byte `protobuf:"bytes,4,opt,name=data,proto3" json:"data,omitempty"`
}

func (m *QueryWebAuthNVerifyRegisterRequest) Reset()         { *m = QueryWebAuthNVerifyRegisterRequest{} }
func (m *QueryWebAuthNVerifyRegisterRequest) String() string { return proto.CompactTextString(m) }
func (*QueryWebAuthNVerifyRegisterRequest) ProtoMessage()    {}
func (*QueryWebAuthNVerifyRegisterRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_2d6eabf4b8b83bc3, []int{0}
}
func (m *QueryWebAuthNVerifyRegisterRequest) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *QueryWebAuthNVerifyRegisterRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_QueryWebAuthNVerifyRegisterRequest.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *QueryWebAuthNVerifyRegisterRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QueryWebAuthNVerifyRegisterRequest.Merge(m, src)
}
func (m *QueryWebAuthNVerifyRegisterRequest) XXX_Size() int {
	return m.Size()
}
func (m *QueryWebAuthNVerifyRegisterRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_QueryWebAuthNVerifyRegisterRequest.DiscardUnknown(m)
}

var xxx_messageInfo_QueryWebAuthNVerifyRegisterRequest proto.InternalMessageInfo

func (m *QueryWebAuthNVerifyRegisterRequest) GetAddr() string {
	if m != nil {
		return m.Addr
	}
	return ""
}

func (m *QueryWebAuthNVerifyRegisterRequest) GetChallenge() string {
	if m != nil {
		return m.Challenge
	}
	return ""
}

func (m *QueryWebAuthNVerifyRegisterRequest) GetRp() string {
	if m != nil {
		return m.Rp
	}
	return ""
}

func (m *QueryWebAuthNVerifyRegisterRequest) GetData() []byte {
	if m != nil {
		return m.Data
	}
	return nil
}

type QueryWebAuthNVerifyRegisterResponse struct {
	Credential []byte `protobuf:"bytes,1,opt,name=credential,proto3" json:"credential,omitempty"`
}

func (m *QueryWebAuthNVerifyRegisterResponse) Reset()         { *m = QueryWebAuthNVerifyRegisterResponse{} }
func (m *QueryWebAuthNVerifyRegisterResponse) String() string { return proto.CompactTextString(m) }
func (*QueryWebAuthNVerifyRegisterResponse) ProtoMessage()    {}
func (*QueryWebAuthNVerifyRegisterResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_2d6eabf4b8b83bc3, []int{1}
}
func (m *QueryWebAuthNVerifyRegisterResponse) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *QueryWebAuthNVerifyRegisterResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_QueryWebAuthNVerifyRegisterResponse.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *QueryWebAuthNVerifyRegisterResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QueryWebAuthNVerifyRegisterResponse.Merge(m, src)
}
func (m *QueryWebAuthNVerifyRegisterResponse) XXX_Size() int {
	return m.Size()
}
func (m *QueryWebAuthNVerifyRegisterResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_QueryWebAuthNVerifyRegisterResponse.DiscardUnknown(m)
}

var xxx_messageInfo_QueryWebAuthNVerifyRegisterResponse proto.InternalMessageInfo

func (m *QueryWebAuthNVerifyRegisterResponse) GetCredential() []byte {
	if m != nil {
		return m.Credential
	}
	return nil
}

type QueryWebAuthNVerifyAuthenticateRequest struct {
	Addr       string `protobuf:"bytes,1,opt,name=addr,proto3" json:"addr,omitempty"`
	Challenge  string `protobuf:"bytes,2,opt,name=challenge,proto3" json:"challenge,omitempty"`
	Rp         string `protobuf:"bytes,3,opt,name=rp,proto3" json:"rp,omitempty"`
	Credential []byte `protobuf:"bytes,4,opt,name=credential,proto3" json:"credential,omitempty"`
	Data       []byte `protobuf:"bytes,5,opt,name=data,proto3" json:"data,omitempty"`
}

func (m *QueryWebAuthNVerifyAuthenticateRequest) Reset() {
	*m = QueryWebAuthNVerifyAuthenticateRequest{}
}
func (m *QueryWebAuthNVerifyAuthenticateRequest) String() string { return proto.CompactTextString(m) }
func (*QueryWebAuthNVerifyAuthenticateRequest) ProtoMessage()    {}
func (*QueryWebAuthNVerifyAuthenticateRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_2d6eabf4b8b83bc3, []int{2}
}
func (m *QueryWebAuthNVerifyAuthenticateRequest) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *QueryWebAuthNVerifyAuthenticateRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_QueryWebAuthNVerifyAuthenticateRequest.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *QueryWebAuthNVerifyAuthenticateRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QueryWebAuthNVerifyAuthenticateRequest.Merge(m, src)
}
func (m *QueryWebAuthNVerifyAuthenticateRequest) XXX_Size() int {
	return m.Size()
}
func (m *QueryWebAuthNVerifyAuthenticateRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_QueryWebAuthNVerifyAuthenticateRequest.DiscardUnknown(m)
}

var xxx_messageInfo_QueryWebAuthNVerifyAuthenticateRequest proto.InternalMessageInfo

func (m *QueryWebAuthNVerifyAuthenticateRequest) GetAddr() string {
	if m != nil {
		return m.Addr
	}
	return ""
}

func (m *QueryWebAuthNVerifyAuthenticateRequest) GetChallenge() string {
	if m != nil {
		return m.Challenge
	}
	return ""
}

func (m *QueryWebAuthNVerifyAuthenticateRequest) GetRp() string {
	if m != nil {
		return m.Rp
	}
	return ""
}

func (m *QueryWebAuthNVerifyAuthenticateRequest) GetCredential() []byte {
	if m != nil {
		return m.Credential
	}
	return nil
}

func (m *QueryWebAuthNVerifyAuthenticateRequest) GetData() []byte {
	if m != nil {
		return m.Data
	}
	return nil
}

type QueryWebAuthNVerifyAuthenticateResponse struct {
}

func (m *QueryWebAuthNVerifyAuthenticateResponse) Reset() {
	*m = QueryWebAuthNVerifyAuthenticateResponse{}
}
func (m *QueryWebAuthNVerifyAuthenticateResponse) String() string { return proto.CompactTextString(m) }
func (*QueryWebAuthNVerifyAuthenticateResponse) ProtoMessage()    {}
func (*QueryWebAuthNVerifyAuthenticateResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_2d6eabf4b8b83bc3, []int{3}
}
func (m *QueryWebAuthNVerifyAuthenticateResponse) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *QueryWebAuthNVerifyAuthenticateResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_QueryWebAuthNVerifyAuthenticateResponse.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *QueryWebAuthNVerifyAuthenticateResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QueryWebAuthNVerifyAuthenticateResponse.Merge(m, src)
}
func (m *QueryWebAuthNVerifyAuthenticateResponse) XXX_Size() int {
	return m.Size()
}
func (m *QueryWebAuthNVerifyAuthenticateResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_QueryWebAuthNVerifyAuthenticateResponse.DiscardUnknown(m)
}

var xxx_messageInfo_QueryWebAuthNVerifyAuthenticateResponse proto.InternalMessageInfo

func init() {
	proto.RegisterType((*QueryWebAuthNVerifyRegisterRequest)(nil), "xion.v1.QueryWebAuthNVerifyRegisterRequest")
	proto.RegisterType((*QueryWebAuthNVerifyRegisterResponse)(nil), "xion.v1.QueryWebAuthNVerifyRegisterResponse")
	proto.RegisterType((*QueryWebAuthNVerifyAuthenticateRequest)(nil), "xion.v1.QueryWebAuthNVerifyAuthenticateRequest")
	proto.RegisterType((*QueryWebAuthNVerifyAuthenticateResponse)(nil), "xion.v1.QueryWebAuthNVerifyAuthenticateResponse")
}

func init() { proto.RegisterFile("xion/v1/query.proto", fileDescriptor_2d6eabf4b8b83bc3) }

var fileDescriptor_2d6eabf4b8b83bc3 = []byte{
	// 340 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0xae, 0xc8, 0xcc, 0xcf,
	0xd3, 0x2f, 0x33, 0xd4, 0x2f, 0x2c, 0x4d, 0x2d, 0xaa, 0xd4, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17,
	0x62, 0x07, 0x09, 0xea, 0x95, 0x19, 0x2a, 0x55, 0x71, 0x29, 0x05, 0x82, 0xc4, 0xc3, 0x53, 0x93,
	0x1c, 0x4b, 0x4b, 0x32, 0xfc, 0xc2, 0x52, 0x8b, 0x32, 0xd3, 0x2a, 0x83, 0x52, 0xd3, 0x33, 0x8b,
	0x4b, 0x52, 0x8b, 0x82, 0x52, 0x0b, 0x4b, 0x53, 0x8b, 0x4b, 0x84, 0x84, 0xb8, 0x58, 0x12, 0x53,
	0x52, 0x8a, 0x24, 0x18, 0x15, 0x18, 0x35, 0x38, 0x83, 0xc0, 0x6c, 0x21, 0x19, 0x2e, 0xce, 0xe4,
	0x8c, 0xc4, 0x9c, 0x9c, 0xd4, 0xbc, 0xf4, 0x54, 0x09, 0x26, 0xb0, 0x04, 0x42, 0x40, 0x88, 0x8f,
	0x8b, 0xa9, 0xa8, 0x40, 0x82, 0x19, 0x2c, 0xcc, 0x54, 0x54, 0x00, 0x32, 0x21, 0x25, 0xb1, 0x24,
	0x51, 0x82, 0x45, 0x81, 0x51, 0x83, 0x27, 0x08, 0xcc, 0x56, 0x72, 0xe5, 0x52, 0xc6, 0x6b, 0x77,
	0x71, 0x41, 0x7e, 0x5e, 0x71, 0xaa, 0x90, 0x1c, 0x17, 0x57, 0x72, 0x51, 0x6a, 0x4a, 0x6a, 0x5e,
	0x49, 0x66, 0x62, 0x0e, 0xd8, 0x09, 0x3c, 0x41, 0x48, 0x22, 0x4a, 0xf3, 0x18, 0xb9, 0xd4, 0xb0,
	0x98, 0x03, 0x62, 0x82, 0x54, 0x24, 0x27, 0x96, 0xa4, 0x52, 0xcf, 0x1f, 0xa8, 0x8e, 0x61, 0x41,
	0x77, 0x0c, 0xdc, 0x9f, 0xac, 0x48, 0xfe, 0xd4, 0xe4, 0x52, 0x27, 0xe8, 0x3e, 0x88, 0x5f, 0x8d,
	0x9a, 0x98, 0xb8, 0x58, 0xc1, 0x6a, 0x85, 0x4a, 0xb9, 0xc4, 0xb0, 0x87, 0x8b, 0x90, 0xb6, 0x1e,
	0x34, 0xf2, 0xf4, 0x08, 0xc7, 0x9c, 0x94, 0x0e, 0x71, 0x8a, 0x21, 0xd6, 0x2b, 0x31, 0x08, 0x35,
	0x32, 0x72, 0x49, 0xe1, 0x76, 0xa7, 0x90, 0x3e, 0x3e, 0xe3, 0xb0, 0x84, 0xb8, 0x94, 0x01, 0xf1,
	0x1a, 0x60, 0x6e, 0x70, 0x72, 0x3c, 0xf1, 0x48, 0x8e, 0xf1, 0xc2, 0x23, 0x39, 0xc6, 0x07, 0x8f,
	0xe4, 0x18, 0x27, 0x3c, 0x96, 0x63, 0xb8, 0xf0, 0x58, 0x8e, 0xe1, 0xc6, 0x63, 0x39, 0x86, 0x28,
	0xf5, 0xf4, 0xcc, 0x92, 0x8c, 0xd2, 0x24, 0xbd, 0xe4, 0xfc, 0x5c, 0xfd, 0xa4, 0xd2, 0xa2, 0xbc,
	0x12, 0xdd, 0x9c, 0xc4, 0xa4, 0x62, 0x7d, 0x70, 0x0a, 0xaf, 0x80, 0x50, 0x25, 0x95, 0x05, 0xa9,
	0xc5, 0x49, 0x6c, 0xe0, 0x64, 0x6e, 0x0c, 0x08, 0x00, 0x00, 0xff, 0xff, 0xcd, 0xd9, 0x5e, 0xff,
	0xfd, 0x02, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// QueryClient is the client API for Query service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type QueryClient interface {
	WebAuthNVerifyRegister(ctx context.Context, in *QueryWebAuthNVerifyRegisterRequest, opts ...grpc.CallOption) (*QueryWebAuthNVerifyRegisterResponse, error)
	WebAuthNVerifyAuthenticate(ctx context.Context, in *QueryWebAuthNVerifyAuthenticateRequest, opts ...grpc.CallOption) (*QueryWebAuthNVerifyAuthenticateResponse, error)
}

type queryClient struct {
	cc grpc1.ClientConn
}

func NewQueryClient(cc grpc1.ClientConn) QueryClient {
	return &queryClient{cc}
}

func (c *queryClient) WebAuthNVerifyRegister(ctx context.Context, in *QueryWebAuthNVerifyRegisterRequest, opts ...grpc.CallOption) (*QueryWebAuthNVerifyRegisterResponse, error) {
	out := new(QueryWebAuthNVerifyRegisterResponse)
	err := c.cc.Invoke(ctx, "/xion.v1.Query/WebAuthNVerifyRegister", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *queryClient) WebAuthNVerifyAuthenticate(ctx context.Context, in *QueryWebAuthNVerifyAuthenticateRequest, opts ...grpc.CallOption) (*QueryWebAuthNVerifyAuthenticateResponse, error) {
	out := new(QueryWebAuthNVerifyAuthenticateResponse)
	err := c.cc.Invoke(ctx, "/xion.v1.Query/WebAuthNVerifyAuthenticate", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// QueryServer is the server API for Query service.
type QueryServer interface {
	WebAuthNVerifyRegister(context.Context, *QueryWebAuthNVerifyRegisterRequest) (*QueryWebAuthNVerifyRegisterResponse, error)
	WebAuthNVerifyAuthenticate(context.Context, *QueryWebAuthNVerifyAuthenticateRequest) (*QueryWebAuthNVerifyAuthenticateResponse, error)
}

// UnimplementedQueryServer can be embedded to have forward compatible implementations.
type UnimplementedQueryServer struct {
}

func (*UnimplementedQueryServer) WebAuthNVerifyRegister(ctx context.Context, req *QueryWebAuthNVerifyRegisterRequest) (*QueryWebAuthNVerifyRegisterResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method WebAuthNVerifyRegister not implemented")
}
func (*UnimplementedQueryServer) WebAuthNVerifyAuthenticate(ctx context.Context, req *QueryWebAuthNVerifyAuthenticateRequest) (*QueryWebAuthNVerifyAuthenticateResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method WebAuthNVerifyAuthenticate not implemented")
}

func RegisterQueryServer(s grpc1.Server, srv QueryServer) {
	s.RegisterService(&_Query_serviceDesc, srv)
}

func _Query_WebAuthNVerifyRegister_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryWebAuthNVerifyRegisterRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueryServer).WebAuthNVerifyRegister(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/xion.v1.Query/WebAuthNVerifyRegister",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueryServer).WebAuthNVerifyRegister(ctx, req.(*QueryWebAuthNVerifyRegisterRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Query_WebAuthNVerifyAuthenticate_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryWebAuthNVerifyAuthenticateRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueryServer).WebAuthNVerifyAuthenticate(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/xion.v1.Query/WebAuthNVerifyAuthenticate",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueryServer).WebAuthNVerifyAuthenticate(ctx, req.(*QueryWebAuthNVerifyAuthenticateRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var Query_serviceDesc = _Query_serviceDesc
var _Query_serviceDesc = grpc.ServiceDesc{
	ServiceName: "xion.v1.Query",
	HandlerType: (*QueryServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "WebAuthNVerifyRegister",
			Handler:    _Query_WebAuthNVerifyRegister_Handler,
		},
		{
			MethodName: "WebAuthNVerifyAuthenticate",
			Handler:    _Query_WebAuthNVerifyAuthenticate_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "xion/v1/query.proto",
}

func (m *QueryWebAuthNVerifyRegisterRequest) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *QueryWebAuthNVerifyRegisterRequest) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *QueryWebAuthNVerifyRegisterRequest) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.Data) > 0 {
		i -= len(m.Data)
		copy(dAtA[i:], m.Data)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Data)))
		i--
		dAtA[i] = 0x22
	}
	if len(m.Rp) > 0 {
		i -= len(m.Rp)
		copy(dAtA[i:], m.Rp)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Rp)))
		i--
		dAtA[i] = 0x1a
	}
	if len(m.Challenge) > 0 {
		i -= len(m.Challenge)
		copy(dAtA[i:], m.Challenge)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Challenge)))
		i--
		dAtA[i] = 0x12
	}
	if len(m.Addr) > 0 {
		i -= len(m.Addr)
		copy(dAtA[i:], m.Addr)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Addr)))
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func (m *QueryWebAuthNVerifyRegisterResponse) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *QueryWebAuthNVerifyRegisterResponse) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *QueryWebAuthNVerifyRegisterResponse) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.Credential) > 0 {
		i -= len(m.Credential)
		copy(dAtA[i:], m.Credential)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Credential)))
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func (m *QueryWebAuthNVerifyAuthenticateRequest) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *QueryWebAuthNVerifyAuthenticateRequest) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *QueryWebAuthNVerifyAuthenticateRequest) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.Data) > 0 {
		i -= len(m.Data)
		copy(dAtA[i:], m.Data)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Data)))
		i--
		dAtA[i] = 0x2a
	}
	if len(m.Credential) > 0 {
		i -= len(m.Credential)
		copy(dAtA[i:], m.Credential)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Credential)))
		i--
		dAtA[i] = 0x22
	}
	if len(m.Rp) > 0 {
		i -= len(m.Rp)
		copy(dAtA[i:], m.Rp)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Rp)))
		i--
		dAtA[i] = 0x1a
	}
	if len(m.Challenge) > 0 {
		i -= len(m.Challenge)
		copy(dAtA[i:], m.Challenge)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Challenge)))
		i--
		dAtA[i] = 0x12
	}
	if len(m.Addr) > 0 {
		i -= len(m.Addr)
		copy(dAtA[i:], m.Addr)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Addr)))
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func (m *QueryWebAuthNVerifyAuthenticateResponse) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *QueryWebAuthNVerifyAuthenticateResponse) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *QueryWebAuthNVerifyAuthenticateResponse) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	return len(dAtA) - i, nil
}

func encodeVarintQuery(dAtA []byte, offset int, v uint64) int {
	offset -= sovQuery(v)
	base := offset
	for v >= 1<<7 {
		dAtA[offset] = uint8(v&0x7f | 0x80)
		v >>= 7
		offset++
	}
	dAtA[offset] = uint8(v)
	return base
}
func (m *QueryWebAuthNVerifyRegisterRequest) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = len(m.Addr)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	l = len(m.Challenge)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	l = len(m.Rp)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	l = len(m.Data)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	return n
}

func (m *QueryWebAuthNVerifyRegisterResponse) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = len(m.Credential)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	return n
}

func (m *QueryWebAuthNVerifyAuthenticateRequest) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = len(m.Addr)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	l = len(m.Challenge)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	l = len(m.Rp)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	l = len(m.Credential)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	l = len(m.Data)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	return n
}

func (m *QueryWebAuthNVerifyAuthenticateResponse) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	return n
}

func sovQuery(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozQuery(x uint64) (n int) {
	return sovQuery(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (m *QueryWebAuthNVerifyRegisterRequest) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowQuery
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: QueryWebAuthNVerifyRegisterRequest: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: QueryWebAuthNVerifyRegisterRequest: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Addr", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				stringLen |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			intStringLen := int(stringLen)
			if intStringLen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Addr = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 2:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Challenge", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				stringLen |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			intStringLen := int(stringLen)
			if intStringLen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Challenge = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 3:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Rp", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				stringLen |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			intStringLen := int(stringLen)
			if intStringLen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Rp = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 4:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Data", wireType)
			}
			var byteLen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				byteLen |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if byteLen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + byteLen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Data = append(m.Data[:0], dAtA[iNdEx:postIndex]...)
			if m.Data == nil {
				m.Data = []byte{}
			}
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipQuery(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if (skippy < 0) || (iNdEx+skippy) < 0 {
				return ErrInvalidLengthQuery
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func (m *QueryWebAuthNVerifyRegisterResponse) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowQuery
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: QueryWebAuthNVerifyRegisterResponse: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: QueryWebAuthNVerifyRegisterResponse: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Credential", wireType)
			}
			var byteLen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				byteLen |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if byteLen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + byteLen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Credential = append(m.Credential[:0], dAtA[iNdEx:postIndex]...)
			if m.Credential == nil {
				m.Credential = []byte{}
			}
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipQuery(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if (skippy < 0) || (iNdEx+skippy) < 0 {
				return ErrInvalidLengthQuery
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func (m *QueryWebAuthNVerifyAuthenticateRequest) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowQuery
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: QueryWebAuthNVerifyAuthenticateRequest: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: QueryWebAuthNVerifyAuthenticateRequest: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Addr", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				stringLen |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			intStringLen := int(stringLen)
			if intStringLen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Addr = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 2:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Challenge", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				stringLen |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			intStringLen := int(stringLen)
			if intStringLen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Challenge = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 3:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Rp", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				stringLen |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			intStringLen := int(stringLen)
			if intStringLen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Rp = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 4:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Credential", wireType)
			}
			var byteLen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				byteLen |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if byteLen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + byteLen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Credential = append(m.Credential[:0], dAtA[iNdEx:postIndex]...)
			if m.Credential == nil {
				m.Credential = []byte{}
			}
			iNdEx = postIndex
		case 5:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Data", wireType)
			}
			var byteLen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				byteLen |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if byteLen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + byteLen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Data = append(m.Data[:0], dAtA[iNdEx:postIndex]...)
			if m.Data == nil {
				m.Data = []byte{}
			}
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipQuery(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if (skippy < 0) || (iNdEx+skippy) < 0 {
				return ErrInvalidLengthQuery
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func (m *QueryWebAuthNVerifyAuthenticateResponse) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowQuery
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: QueryWebAuthNVerifyAuthenticateResponse: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: QueryWebAuthNVerifyAuthenticateResponse: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		default:
			iNdEx = preIndex
			skippy, err := skipQuery(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if (skippy < 0) || (iNdEx+skippy) < 0 {
				return ErrInvalidLengthQuery
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func skipQuery(dAtA []byte) (n int, err error) {
	l := len(dAtA)
	iNdEx := 0
	depth := 0
	for iNdEx < l {
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return 0, ErrIntOverflowQuery
			}
			if iNdEx >= l {
				return 0, io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= (uint64(b) & 0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		wireType := int(wire & 0x7)
		switch wireType {
		case 0:
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return 0, ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return 0, io.ErrUnexpectedEOF
				}
				iNdEx++
				if dAtA[iNdEx-1] < 0x80 {
					break
				}
			}
		case 1:
			iNdEx += 8
		case 2:
			var length int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return 0, ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return 0, io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				length |= (int(b) & 0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if length < 0 {
				return 0, ErrInvalidLengthQuery
			}
			iNdEx += length
		case 3:
			depth++
		case 4:
			if depth == 0 {
				return 0, ErrUnexpectedEndOfGroupQuery
			}
			depth--
		case 5:
			iNdEx += 4
		default:
			return 0, fmt.Errorf("proto: illegal wireType %d", wireType)
		}
		if iNdEx < 0 {
			return 0, ErrInvalidLengthQuery
		}
		if depth == 0 {
			return iNdEx, nil
		}
	}
	return 0, io.ErrUnexpectedEOF
}

var (
	ErrInvalidLengthQuery        = fmt.Errorf("proto: negative length found during unmarshaling")
	ErrIntOverflowQuery          = fmt.Errorf("proto: integer overflow")
	ErrUnexpectedEndOfGroupQuery = fmt.Errorf("proto: unexpected end of group")
)
