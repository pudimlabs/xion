// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: xion/v1/genesis.proto

package types

import (
	fmt "fmt"
	github_com_cosmos_cosmos_sdk_types "github.com/cosmos/cosmos-sdk/types"
	types "github.com/cosmos/cosmos-sdk/types"
	_ "github.com/cosmos/gogoproto/gogoproto"
	proto "github.com/cosmos/gogoproto/proto"
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

type GenesisState struct {
	PlatformPercentage uint32                                   `protobuf:"varint,1,opt,name=platform_percentage,json=platformPercentage,proto3" json:"platform_percentage,omitempty"`
	PlatformMinimums   github_com_cosmos_cosmos_sdk_types.Coins `protobuf:"bytes,2,rep,name=platform_minimums,json=platformMinimums,proto3,castrepeated=github.com/cosmos/cosmos-sdk/types.Coins" json:"platform_minimums,omitempty" yaml:"platform_minimums"`
}

func (m *GenesisState) Reset()         { *m = GenesisState{} }
func (m *GenesisState) String() string { return proto.CompactTextString(m) }
func (*GenesisState) ProtoMessage()    {}
func (*GenesisState) Descriptor() ([]byte, []int) {
	return fileDescriptor_9a0f59b6b1baf029, []int{0}
}
func (m *GenesisState) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *GenesisState) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_GenesisState.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *GenesisState) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GenesisState.Merge(m, src)
}
func (m *GenesisState) XXX_Size() int {
	return m.Size()
}
func (m *GenesisState) XXX_DiscardUnknown() {
	xxx_messageInfo_GenesisState.DiscardUnknown(m)
}

var xxx_messageInfo_GenesisState proto.InternalMessageInfo

func (m *GenesisState) GetPlatformPercentage() uint32 {
	if m != nil {
		return m.PlatformPercentage
	}
	return 0
}

func (m *GenesisState) GetPlatformMinimums() github_com_cosmos_cosmos_sdk_types.Coins {
	if m != nil {
		return m.PlatformMinimums
	}
	return nil
}

func init() {
	proto.RegisterType((*GenesisState)(nil), "xion.v1.GenesisState")
}

func init() { proto.RegisterFile("xion/v1/genesis.proto", fileDescriptor_9a0f59b6b1baf029) }

var fileDescriptor_9a0f59b6b1baf029 = []byte{
	// 312 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0xad, 0xc8, 0xcc, 0xcf,
	0xd3, 0x2f, 0x33, 0xd4, 0x4f, 0x4f, 0xcd, 0x4b, 0x2d, 0xce, 0x2c, 0xd6, 0x2b, 0x28, 0xca, 0x2f,
	0xc9, 0x17, 0x62, 0x07, 0x09, 0xeb, 0x95, 0x19, 0x4a, 0xc9, 0x25, 0xe7, 0x17, 0xe7, 0xe6, 0x17,
	0xeb, 0x27, 0x25, 0x16, 0xa7, 0xea, 0x97, 0x19, 0x26, 0xa5, 0x96, 0x24, 0x1a, 0xea, 0x27, 0xe7,
	0x67, 0xe6, 0x41, 0x14, 0x4a, 0x89, 0xa4, 0xe7, 0xa7, 0xe7, 0x83, 0x99, 0xfa, 0x20, 0x16, 0x44,
	0x54, 0xe9, 0x2b, 0x23, 0x17, 0x8f, 0x3b, 0xc4, 0xc0, 0xe0, 0x92, 0xc4, 0x92, 0x54, 0x21, 0x7d,
	0x2e, 0xe1, 0x82, 0x9c, 0xc4, 0x92, 0xb4, 0xfc, 0xa2, 0xdc, 0xf8, 0x82, 0xd4, 0xa2, 0xe4, 0xd4,
	0xbc, 0x92, 0xc4, 0xf4, 0x54, 0x09, 0x46, 0x05, 0x46, 0x0d, 0xde, 0x20, 0x21, 0x98, 0x54, 0x00,
	0x5c, 0x46, 0x68, 0x33, 0x23, 0x97, 0x20, 0x5c, 0x47, 0x6e, 0x66, 0x5e, 0x66, 0x6e, 0x69, 0x6e,
	0xb1, 0x04, 0x93, 0x02, 0xb3, 0x06, 0xb7, 0x91, 0xa4, 0x1e, 0xc4, 0x51, 0x7a, 0x20, 0x47, 0xe9,
	0x41, 0x1d, 0xa5, 0xe7, 0x9c, 0x9f, 0x99, 0xe7, 0x94, 0x7d, 0xe2, 0x9e, 0x3c, 0xc3, 0xab, 0x7b,
	0xf2, 0xd2, 0x18, 0x7a, 0x75, 0xf2, 0x73, 0x33, 0x4b, 0x52, 0x73, 0x0b, 0x4a, 0x2a, 0x3f, 0xdd,
	0x93, 0x97, 0xa8, 0x4c, 0xcc, 0xcd, 0xb1, 0x52, 0xc2, 0x50, 0xa4, 0xb4, 0xea, 0xbe, 0xbc, 0x46,
	0x7a, 0x66, 0x49, 0x46, 0x69, 0x92, 0x5e, 0x72, 0x7e, 0xae, 0x3e, 0xd4, 0xf3, 0x10, 0x4a, 0xb7,
	0x38, 0x25, 0x5b, 0xbf, 0xa4, 0xb2, 0x20, 0xb5, 0x18, 0x6c, 0x57, 0x71, 0x90, 0x00, 0x4c, 0xbf,
	0x2f, 0x54, 0xbb, 0x93, 0xe3, 0x89, 0x47, 0x72, 0x8c, 0x17, 0x1e, 0xc9, 0x31, 0x3e, 0x78, 0x24,
	0xc7, 0x38, 0xe1, 0xb1, 0x1c, 0xc3, 0x85, 0xc7, 0x72, 0x0c, 0x37, 0x1e, 0xcb, 0x31, 0x44, 0xa9,
	0x23, 0x99, 0x9a, 0x54, 0x5a, 0x94, 0x57, 0xa2, 0x9b, 0x93, 0x98, 0x54, 0xac, 0x0f, 0x0e, 0xfd,
	0x0a, 0x08, 0x05, 0x36, 0x3a, 0x89, 0x0d, 0x1c, 0x82, 0xc6, 0x80, 0x00, 0x00, 0x00, 0xff, 0xff,
	0xa0, 0xd2, 0xf5, 0xdb, 0x99, 0x01, 0x00, 0x00,
}

func (m *GenesisState) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *GenesisState) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *GenesisState) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.PlatformMinimums) > 0 {
		for iNdEx := len(m.PlatformMinimums) - 1; iNdEx >= 0; iNdEx-- {
			{
				size, err := m.PlatformMinimums[iNdEx].MarshalToSizedBuffer(dAtA[:i])
				if err != nil {
					return 0, err
				}
				i -= size
				i = encodeVarintGenesis(dAtA, i, uint64(size))
			}
			i--
			dAtA[i] = 0x12
		}
	}
	if m.PlatformPercentage != 0 {
		i = encodeVarintGenesis(dAtA, i, uint64(m.PlatformPercentage))
		i--
		dAtA[i] = 0x8
	}
	return len(dAtA) - i, nil
}

func encodeVarintGenesis(dAtA []byte, offset int, v uint64) int {
	offset -= sovGenesis(v)
	base := offset
	for v >= 1<<7 {
		dAtA[offset] = uint8(v&0x7f | 0x80)
		v >>= 7
		offset++
	}
	dAtA[offset] = uint8(v)
	return base
}
func (m *GenesisState) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if m.PlatformPercentage != 0 {
		n += 1 + sovGenesis(uint64(m.PlatformPercentage))
	}
	if len(m.PlatformMinimums) > 0 {
		for _, e := range m.PlatformMinimums {
			l = e.Size()
			n += 1 + l + sovGenesis(uint64(l))
		}
	}
	return n
}

func sovGenesis(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozGenesis(x uint64) (n int) {
	return sovGenesis(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (m *GenesisState) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowGenesis
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
			return fmt.Errorf("proto: GenesisState: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: GenesisState: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 0 {
				return fmt.Errorf("proto: wrong wireType = %d for field PlatformPercentage", wireType)
			}
			m.PlatformPercentage = 0
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowGenesis
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				m.PlatformPercentage |= uint32(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
		case 2:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field PlatformMinimums", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowGenesis
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
				return ErrInvalidLengthGenesis
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthGenesis
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.PlatformMinimums = append(m.PlatformMinimums, types.Coin{})
			if err := m.PlatformMinimums[len(m.PlatformMinimums)-1].Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
			}
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipGenesis(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if (skippy < 0) || (iNdEx+skippy) < 0 {
				return ErrInvalidLengthGenesis
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
func skipGenesis(dAtA []byte) (n int, err error) {
	l := len(dAtA)
	iNdEx := 0
	depth := 0
	for iNdEx < l {
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return 0, ErrIntOverflowGenesis
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
					return 0, ErrIntOverflowGenesis
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
					return 0, ErrIntOverflowGenesis
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
				return 0, ErrInvalidLengthGenesis
			}
			iNdEx += length
		case 3:
			depth++
		case 4:
			if depth == 0 {
				return 0, ErrUnexpectedEndOfGroupGenesis
			}
			depth--
		case 5:
			iNdEx += 4
		default:
			return 0, fmt.Errorf("proto: illegal wireType %d", wireType)
		}
		if iNdEx < 0 {
			return 0, ErrInvalidLengthGenesis
		}
		if depth == 0 {
			return iNdEx, nil
		}
	}
	return 0, io.ErrUnexpectedEOF
}

var (
	ErrInvalidLengthGenesis        = fmt.Errorf("proto: negative length found during unmarshaling")
	ErrIntOverflowGenesis          = fmt.Errorf("proto: integer overflow")
	ErrUnexpectedEndOfGroupGenesis = fmt.Errorf("proto: unexpected end of group")
)
