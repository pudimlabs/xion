// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: xion/dkim/v1/query.proto

package types

import (
	context "context"
	fmt "fmt"
	grpc1 "github.com/cosmos/gogoproto/grpc"
	proto "github.com/cosmos/gogoproto/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
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

// QueryParamsRequest is the request type for the Query/Params RPC method.
type QueryParamsRequest struct {
}

func (m *QueryParamsRequest) Reset()         { *m = QueryParamsRequest{} }
func (m *QueryParamsRequest) String() string { return proto.CompactTextString(m) }
func (*QueryParamsRequest) ProtoMessage()    {}
func (*QueryParamsRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_ef31cf4588a86e6f, []int{0}
}
func (m *QueryParamsRequest) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *QueryParamsRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_QueryParamsRequest.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *QueryParamsRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QueryParamsRequest.Merge(m, src)
}
func (m *QueryParamsRequest) XXX_Size() int {
	return m.Size()
}
func (m *QueryParamsRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_QueryParamsRequest.DiscardUnknown(m)
}

var xxx_messageInfo_QueryParamsRequest proto.InternalMessageInfo

// QueryParamsResponse is the response type for the Query/Params RPC method.
type QueryParamsResponse struct {
	// params defines the parameters of the module.
	Params *Params `protobuf:"bytes,1,opt,name=params,proto3" json:"params,omitempty"`
}

func (m *QueryParamsResponse) Reset()         { *m = QueryParamsResponse{} }
func (m *QueryParamsResponse) String() string { return proto.CompactTextString(m) }
func (*QueryParamsResponse) ProtoMessage()    {}
func (*QueryParamsResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_ef31cf4588a86e6f, []int{1}
}
func (m *QueryParamsResponse) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *QueryParamsResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_QueryParamsResponse.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *QueryParamsResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QueryParamsResponse.Merge(m, src)
}
func (m *QueryParamsResponse) XXX_Size() int {
	return m.Size()
}
func (m *QueryParamsResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_QueryParamsResponse.DiscardUnknown(m)
}

var xxx_messageInfo_QueryParamsResponse proto.InternalMessageInfo

func (m *QueryParamsResponse) GetParams() *Params {
	if m != nil {
		return m.Params
	}
	return nil
}

// QueryDkimPubKeysRequest is the request type for the Query/DkimPubKeys RPC method.
type QueryDkimPubKeyRequest struct {
	Selector string `protobuf:"bytes,1,opt,name=selector,proto3" json:"selector,omitempty"`
	Domain   string `protobuf:"bytes,2,opt,name=domain,proto3" json:"domain,omitempty"`
}

func (m *QueryDkimPubKeyRequest) Reset()         { *m = QueryDkimPubKeyRequest{} }
func (m *QueryDkimPubKeyRequest) String() string { return proto.CompactTextString(m) }
func (*QueryDkimPubKeyRequest) ProtoMessage()    {}
func (*QueryDkimPubKeyRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_ef31cf4588a86e6f, []int{2}
}
func (m *QueryDkimPubKeyRequest) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *QueryDkimPubKeyRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_QueryDkimPubKeyRequest.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *QueryDkimPubKeyRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QueryDkimPubKeyRequest.Merge(m, src)
}
func (m *QueryDkimPubKeyRequest) XXX_Size() int {
	return m.Size()
}
func (m *QueryDkimPubKeyRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_QueryDkimPubKeyRequest.DiscardUnknown(m)
}

var xxx_messageInfo_QueryDkimPubKeyRequest proto.InternalMessageInfo

func (m *QueryDkimPubKeyRequest) GetSelector() string {
	if m != nil {
		return m.Selector
	}
	return ""
}

func (m *QueryDkimPubKeyRequest) GetDomain() string {
	if m != nil {
		return m.Domain
	}
	return ""
}

// QueryDkimPubKeysResponse is the response type for the Query/DkimPubKeys RPC method.
type QueryDkimPubKeyResponse struct {
	DkimPubkey   *DkimPubKey `protobuf:"bytes,1,opt,name=dkim_pubkey,json=dkimPubkey,proto3" json:"dkim_pubkey,omitempty"`
	PoseidonHash []byte      `protobuf:"bytes,2,opt,name=poseidon_hash,json=poseidonHash,proto3" json:"poseidon_hash,omitempty"`
}

func (m *QueryDkimPubKeyResponse) Reset()         { *m = QueryDkimPubKeyResponse{} }
func (m *QueryDkimPubKeyResponse) String() string { return proto.CompactTextString(m) }
func (*QueryDkimPubKeyResponse) ProtoMessage()    {}
func (*QueryDkimPubKeyResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_ef31cf4588a86e6f, []int{3}
}
func (m *QueryDkimPubKeyResponse) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *QueryDkimPubKeyResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_QueryDkimPubKeyResponse.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *QueryDkimPubKeyResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QueryDkimPubKeyResponse.Merge(m, src)
}
func (m *QueryDkimPubKeyResponse) XXX_Size() int {
	return m.Size()
}
func (m *QueryDkimPubKeyResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_QueryDkimPubKeyResponse.DiscardUnknown(m)
}

var xxx_messageInfo_QueryDkimPubKeyResponse proto.InternalMessageInfo

func (m *QueryDkimPubKeyResponse) GetDkimPubkey() *DkimPubKey {
	if m != nil {
		return m.DkimPubkey
	}
	return nil
}

func (m *QueryDkimPubKeyResponse) GetPoseidonHash() []byte {
	if m != nil {
		return m.PoseidonHash
	}
	return nil
}

func init() {
	proto.RegisterType((*QueryParamsRequest)(nil), "xion.dkim.v1.QueryParamsRequest")
	proto.RegisterType((*QueryParamsResponse)(nil), "xion.dkim.v1.QueryParamsResponse")
	proto.RegisterType((*QueryDkimPubKeyRequest)(nil), "xion.dkim.v1.QueryDkimPubKeyRequest")
	proto.RegisterType((*QueryDkimPubKeyResponse)(nil), "xion.dkim.v1.QueryDkimPubKeyResponse")
}

func init() { proto.RegisterFile("xion/dkim/v1/query.proto", fileDescriptor_ef31cf4588a86e6f) }

var fileDescriptor_ef31cf4588a86e6f = []byte{
	// 408 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x84, 0x92, 0x4f, 0x4f, 0xa3, 0x40,
	0x18, 0xc6, 0x4b, 0x93, 0x25, 0xbb, 0xd3, 0x6e, 0x36, 0x3b, 0xdb, 0x6d, 0x09, 0xd9, 0x25, 0x5d,
	0x56, 0xa3, 0x07, 0x85, 0xb4, 0x9e, 0x3c, 0xfa, 0xe7, 0x60, 0xa2, 0x87, 0xda, 0xa3, 0x97, 0x66,
	0x28, 0x23, 0x4c, 0x28, 0x33, 0x94, 0x19, 0x9a, 0x72, 0xf5, 0x13, 0x98, 0xf8, 0xa5, 0x3c, 0x36,
	0xf1, 0xe2, 0xd1, 0xb4, 0x5e, 0xfc, 0x16, 0x86, 0x81, 0xd6, 0x92, 0x1a, 0xbd, 0x31, 0xef, 0xf3,
	0xf0, 0x7b, 0x1e, 0x5e, 0x06, 0x68, 0x53, 0xc2, 0xa8, 0xed, 0x06, 0x24, 0xb4, 0x27, 0x1d, 0x7b,
	0x9c, 0xe0, 0x38, 0xb5, 0xa2, 0x98, 0x09, 0x06, 0xeb, 0x99, 0x62, 0x65, 0x8a, 0x35, 0xe9, 0xe8,
	0x7f, 0x3c, 0xc6, 0xbc, 0x11, 0xb6, 0x51, 0x44, 0x6c, 0x44, 0x29, 0x13, 0x48, 0x10, 0x46, 0x79,
	0xee, 0xd5, 0xf5, 0x12, 0xc5, 0xc3, 0x14, 0x73, 0xb2, 0xd4, 0xca, 0x09, 0x5c, 0x20, 0x81, 0x73,
	0xc5, 0x6c, 0x00, 0x78, 0x99, 0x05, 0xf6, 0x50, 0x8c, 0x42, 0xde, 0xc7, 0xe3, 0x04, 0x73, 0x61,
	0x9e, 0x80, 0x5f, 0xa5, 0x29, 0x8f, 0x18, 0xe5, 0x18, 0xee, 0x01, 0x35, 0x92, 0x13, 0x4d, 0x69,
	0x2b, 0xbb, 0xb5, 0x6e, 0xc3, 0x5a, 0xef, 0x67, 0x15, 0xee, 0xc2, 0x63, 0x5e, 0x80, 0xa6, 0x84,
	0x9c, 0x06, 0x24, 0xec, 0x25, 0xce, 0x39, 0x4e, 0x0b, 0x3c, 0xd4, 0xc1, 0x57, 0x8e, 0x47, 0x78,
	0x28, 0x58, 0x2c, 0x49, 0xdf, 0xfa, 0xab, 0x33, 0x6c, 0x02, 0xd5, 0x65, 0x21, 0x22, 0x54, 0xab,
	0x4a, 0xa5, 0x38, 0x99, 0x29, 0x68, 0x6d, 0xd0, 0x8a, 0x5a, 0x87, 0xa0, 0x96, 0x55, 0x18, 0x44,
	0x89, 0x13, 0xe0, 0xb4, 0xe8, 0xa6, 0x95, 0xbb, 0xad, 0xbd, 0x06, 0xdc, 0xfc, 0x39, 0xc0, 0x29,
	0xfc, 0x0f, 0xbe, 0x47, 0x8c, 0x63, 0xe2, 0x32, 0x3a, 0xf0, 0x11, 0xf7, 0x65, 0x68, 0xbd, 0x5f,
	0x5f, 0x0e, 0xcf, 0x10, 0xf7, 0xbb, 0x2f, 0x0a, 0xf8, 0x22, 0xb3, 0xe1, 0x35, 0x50, 0xf3, 0x8f,
	0x84, 0xed, 0x32, 0x7e, 0x73, 0x87, 0xfa, 0xbf, 0x0f, 0x1c, 0x79, 0x71, 0xb3, 0x75, 0xf3, 0xf0,
	0x7c, 0x57, 0xfd, 0x09, 0x7f, 0xac, 0x7e, 0x4d, 0xbe, 0x3a, 0x38, 0x05, 0xe0, 0xad, 0x30, 0xdc,
	0x7a, 0x87, 0xb4, 0xb1, 0x54, 0x7d, 0xfb, 0x13, 0x57, 0x91, 0xf9, 0x57, 0x66, 0xb6, 0xe0, 0xef,
	0x55, 0xe6, 0xda, 0xee, 0xf8, 0xf1, 0xd1, 0xfd, 0xdc, 0x50, 0x66, 0x73, 0x43, 0x79, 0x9a, 0x1b,
	0xca, 0xed, 0xc2, 0xa8, 0xcc, 0x16, 0x46, 0xe5, 0x71, 0x61, 0x54, 0xae, 0x76, 0x3c, 0x22, 0xfc,
	0xc4, 0xb1, 0x86, 0x2c, 0xb4, 0x9d, 0x24, 0xa6, 0x62, 0x7f, 0x84, 0x1c, 0x6e, 0xcb, 0x9b, 0x35,
	0xcd, 0x61, 0x22, 0x8d, 0x30, 0x77, 0x54, 0x79, 0xb3, 0x0e, 0x5e, 0x03, 0x00, 0x00, 0xff, 0xff,
	0xfa, 0xd9, 0xdf, 0x2c, 0xd7, 0x02, 0x00, 0x00,
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
	// Params queries all parameters of the module.
	Params(ctx context.Context, in *QueryParamsRequest, opts ...grpc.CallOption) (*QueryParamsResponse, error)
	// DkimPubKey queries the DKIM public key for a given selector and domain.
	DkimPubKey(ctx context.Context, in *QueryDkimPubKeyRequest, opts ...grpc.CallOption) (*QueryDkimPubKeyResponse, error)
}

type queryClient struct {
	cc grpc1.ClientConn
}

func NewQueryClient(cc grpc1.ClientConn) QueryClient {
	return &queryClient{cc}
}

func (c *queryClient) Params(ctx context.Context, in *QueryParamsRequest, opts ...grpc.CallOption) (*QueryParamsResponse, error) {
	out := new(QueryParamsResponse)
	err := c.cc.Invoke(ctx, "/xion.dkim.v1.Query/Params", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *queryClient) DkimPubKey(ctx context.Context, in *QueryDkimPubKeyRequest, opts ...grpc.CallOption) (*QueryDkimPubKeyResponse, error) {
	out := new(QueryDkimPubKeyResponse)
	err := c.cc.Invoke(ctx, "/xion.dkim.v1.Query/DkimPubKey", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// QueryServer is the server API for Query service.
type QueryServer interface {
	// Params queries all parameters of the module.
	Params(context.Context, *QueryParamsRequest) (*QueryParamsResponse, error)
	// DkimPubKey queries the DKIM public key for a given selector and domain.
	DkimPubKey(context.Context, *QueryDkimPubKeyRequest) (*QueryDkimPubKeyResponse, error)
}

// UnimplementedQueryServer can be embedded to have forward compatible implementations.
type UnimplementedQueryServer struct {
}

func (*UnimplementedQueryServer) Params(ctx context.Context, req *QueryParamsRequest) (*QueryParamsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Params not implemented")
}
func (*UnimplementedQueryServer) DkimPubKey(ctx context.Context, req *QueryDkimPubKeyRequest) (*QueryDkimPubKeyResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DkimPubKey not implemented")
}

func RegisterQueryServer(s grpc1.Server, srv QueryServer) {
	s.RegisterService(&_Query_serviceDesc, srv)
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
		FullMethod: "/xion.dkim.v1.Query/Params",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueryServer).Params(ctx, req.(*QueryParamsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Query_DkimPubKey_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryDkimPubKeyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueryServer).DkimPubKey(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/xion.dkim.v1.Query/DkimPubKey",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueryServer).DkimPubKey(ctx, req.(*QueryDkimPubKeyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var Query_serviceDesc = _Query_serviceDesc
var _Query_serviceDesc = grpc.ServiceDesc{
	ServiceName: "xion.dkim.v1.Query",
	HandlerType: (*QueryServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Params",
			Handler:    _Query_Params_Handler,
		},
		{
			MethodName: "DkimPubKey",
			Handler:    _Query_DkimPubKey_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "xion/dkim/v1/query.proto",
}

func (m *QueryParamsRequest) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *QueryParamsRequest) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *QueryParamsRequest) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	return len(dAtA) - i, nil
}

func (m *QueryParamsResponse) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *QueryParamsResponse) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *QueryParamsResponse) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if m.Params != nil {
		{
			size, err := m.Params.MarshalToSizedBuffer(dAtA[:i])
			if err != nil {
				return 0, err
			}
			i -= size
			i = encodeVarintQuery(dAtA, i, uint64(size))
		}
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func (m *QueryDkimPubKeyRequest) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *QueryDkimPubKeyRequest) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *QueryDkimPubKeyRequest) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.Domain) > 0 {
		i -= len(m.Domain)
		copy(dAtA[i:], m.Domain)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Domain)))
		i--
		dAtA[i] = 0x12
	}
	if len(m.Selector) > 0 {
		i -= len(m.Selector)
		copy(dAtA[i:], m.Selector)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.Selector)))
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func (m *QueryDkimPubKeyResponse) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *QueryDkimPubKeyResponse) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *QueryDkimPubKeyResponse) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.PoseidonHash) > 0 {
		i -= len(m.PoseidonHash)
		copy(dAtA[i:], m.PoseidonHash)
		i = encodeVarintQuery(dAtA, i, uint64(len(m.PoseidonHash)))
		i--
		dAtA[i] = 0x12
	}
	if m.DkimPubkey != nil {
		{
			size, err := m.DkimPubkey.MarshalToSizedBuffer(dAtA[:i])
			if err != nil {
				return 0, err
			}
			i -= size
			i = encodeVarintQuery(dAtA, i, uint64(size))
		}
		i--
		dAtA[i] = 0xa
	}
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
func (m *QueryParamsRequest) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	return n
}

func (m *QueryParamsResponse) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if m.Params != nil {
		l = m.Params.Size()
		n += 1 + l + sovQuery(uint64(l))
	}
	return n
}

func (m *QueryDkimPubKeyRequest) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = len(m.Selector)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	l = len(m.Domain)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	return n
}

func (m *QueryDkimPubKeyResponse) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if m.DkimPubkey != nil {
		l = m.DkimPubkey.Size()
		n += 1 + l + sovQuery(uint64(l))
	}
	l = len(m.PoseidonHash)
	if l > 0 {
		n += 1 + l + sovQuery(uint64(l))
	}
	return n
}

func sovQuery(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozQuery(x uint64) (n int) {
	return sovQuery(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (m *QueryParamsRequest) Unmarshal(dAtA []byte) error {
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
			return fmt.Errorf("proto: QueryParamsRequest: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: QueryParamsRequest: illegal tag %d (wire type %d)", fieldNum, wire)
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
func (m *QueryParamsResponse) Unmarshal(dAtA []byte) error {
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
			return fmt.Errorf("proto: QueryParamsResponse: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: QueryParamsResponse: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Params", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				msglen |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if msglen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			if m.Params == nil {
				m.Params = &Params{}
			}
			if err := m.Params.Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
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
func (m *QueryDkimPubKeyRequest) Unmarshal(dAtA []byte) error {
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
			return fmt.Errorf("proto: QueryDkimPubKeyRequest: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: QueryDkimPubKeyRequest: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Selector", wireType)
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
			m.Selector = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 2:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Domain", wireType)
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
			m.Domain = string(dAtA[iNdEx:postIndex])
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
func (m *QueryDkimPubKeyResponse) Unmarshal(dAtA []byte) error {
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
			return fmt.Errorf("proto: QueryDkimPubKeyResponse: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: QueryDkimPubKeyResponse: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field DkimPubkey", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowQuery
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				msglen |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if msglen < 0 {
				return ErrInvalidLengthQuery
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthQuery
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			if m.DkimPubkey == nil {
				m.DkimPubkey = &DkimPubKey{}
			}
			if err := m.DkimPubkey.Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
			}
			iNdEx = postIndex
		case 2:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field PoseidonHash", wireType)
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
			m.PoseidonHash = append(m.PoseidonHash[:0], dAtA[iNdEx:postIndex]...)
			if m.PoseidonHash == nil {
				m.PoseidonHash = []byte{}
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
