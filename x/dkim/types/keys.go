package types

import (
	ormv1alpha1 "cosmossdk.io/api/cosmos/orm/v1alpha1"
	"cosmossdk.io/collections"
)

// ParamsKey saves the current module params.
var ParamsKey = collections.NewPrefix(0)

const (
	ModuleName = "dkim"

	StoreKey = ModuleName

	QuerierRoute = ModuleName
)

var ORMModuleSchema = ormv1alpha1.ModuleSchemaDescriptor{
	SchemaFile: []*ormv1alpha1.ModuleSchemaDescriptor_FileEntry{
		{Id: 1, ProtoFileName: "xion/dkim/v1/state.proto"},
	},
	Prefix: []byte{0},
}
