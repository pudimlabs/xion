package types_test

import (
	"math/big"
	"reflect"
	"testing"

	"github.com/burnt-labs/xion/x/dkim/types"
	"github.com/stretchr/testify/require"
)

func TestPoseidonPubKeyHasher(t *testing.T) {
	// Define input array
	pubKeyInput := []string{
		"2042675158572422735167009601580549693",
		"2318426925121163447366268266877478490",
		"1147774667595934040844400996565450529",
		"2585846613753899425173314975383472766",
		"1729550870628631316824527689749144826",
		"1409688764733787577291119235590636170",
		"2653526314989005305308617746718530524",
		"737602834602272445014721319074990651",
		"1108223552850320351953361145401433110",
		"196998911671740026740284042198980922",
		"1810975214051689602006218559773860466",
		"1356973725008685867134185890101517745",
		"1741745429950802523929336578157878155",
		"322242294656712334589977633789887989",
		"1317445847036079731092233939335794482",
		"1737308978482248574701598258817218345",
		"3883364526267798178367189328134785",
	}

	// Expected output
	expected := []string{
		"6163435950105178629810240271252506994950755712324457311647331504036890173",
		"6874359423614614416769547158510909224060810130726549157878117136549084961",
		"3747595542855212514824584670573150084970437762765944378833450103046972666",
		"1960884675047302794617661726788872395537427104125279812832687799235648476",
		"523712937066473333242315902450525568150507974103329268030858613821791254",
		"3607454929652174177256667229820811020213375323862109948230163138130862706",
		"856666958967348083591608562093801769013836882599310809252760100885273483",
		"4618559463054197618782457348072907690834661648404289571418168016192687922",
		"3883364526267798178367189328134785",
	}

	pubKeyInputBigInt, err := types.ConvertStringArrayToBigInt(pubKeyInput)
	require.NoError(t, err)
	expectedOutputBigInt, err := types.ConvertStringArrayToBigInt(expected)
	require.NoError(t, err)
	// Call PubkeyHasher function
	result := types.PreparePubkeyForHashing(pubKeyInputBigInt, types.CIRCOM_BIGINT_N, types.CIRCOM_BIGINT_K)
	require.Equal(t, len(result), len(expectedOutputBigInt))
	// Compare result with expected output
	if !reflect.DeepEqual(result, expectedOutputBigInt) {
		t.Errorf("Expected output: %v, but got: %v", expectedOutputBigInt, result)
	}
}

func TestModulusToCircomBigIntBytes(t *testing.T) {
	// convert a pubkey modulus to circom bigint bytes
	// which is an 17 element array of 121 bit integers
	googlePk := "20054049931062868895890884170436368122145070743595938421415808271536128118589158095389269883866014690926251520949836343482211446965168263353397278625494421205505467588876376305465260221818103647257858226961376710643349248303872103127777544119851941320649869060657585270523355729363214754986381410240666592048188131951162530964876952500210032559004364102337827202989395200573305906145708107347940692172630683838117810759589085094521858867092874903269345174914871903592244831151967447426692922405241398232069182007622735165026000699140578092635934951967194944536539675594791745699200646238889064236642593556016708235359" // modulus
	xPk := "24170173314767618578635859866442090714207937556617194984733965986568747225472041760957687914800744414586185499748527211718027206281015243400718946005960438592384814188287668684380096584018827045562716538073514533141746763135370368115010636792381911049943213387571718109510408110009654505050862674367795200141810596470961198042086717537565180492467061016489268227818261177307270133867944152075471294600669578677169400600801527291827638313596107874704797337527011867253419993871172498129108180754248753692979918601386452627920307201073091455071798797692261328864704161941637957366994122582217126031620226526000607249981"
	googleBigInt, isSet := new(big.Int).SetString(googlePk, 10)
	require.True(t, isSet)
	xBigInt, isSet := new(big.Int).SetString(xPk, 10)
	require.True(t, isSet)
	expectedGoogle := []string{
		"2107195391459410975264579855291297887",
		"2562632063603354817278035230349645235",
		"1868388447387859563289339873373526818",
		"2159353473203648408714805618210333973",
		"351789365378952303483249084740952389",
		"659717315519250910761248850885776286",
		"1321773785542335225811636767147612036",
		"258646249156909342262859240016844424",
		"644872192691135519287736182201377504",
		"174898460680981733302111356557122107",
		"1068744134187917319695255728151595132",
		"1870792114609696396265442109963534232",
		"8288818605536063568933922407756344",
		"1446710439657393605686016190803199177",
		"2256068140678002554491951090436701670",
		"518946826903468667178458656376730744",
		"3222036726675473160989497427257757",
	}
	expectedX := []string{
		"2042675158572422735167009601580549693",
		"2318426925121163447366268266877478490",
		"1147774667595934040844400996565450529",
		"2585846613753899425173314975383472766",
		"1729550870628631316824527689749144826",
		"1409688764733787577291119235590636170",
		"2653526314989005305308617746718530524",
		"737602834602272445014721319074990651",
		"1108223552850320351953361145401433110",
		"196998911671740026740284042198980922",
		"1810975214051689602006218559773860466",
		"1356973725008685867134185890101517745",
		"1741745429950802523929336578157878155",
		"322242294656712334589977633789887989",
		"1317445847036079731092233939335794482",
		"1737308978482248574701598258817218345",
		"3883364526267798178367189328134785",
	}
	expectedGoogleBigInt, err := types.ConvertStringArrayToBigInt(expectedGoogle)
	require.NoError(t, err)
	expectedXBigInt, err := types.ConvertStringArrayToBigInt(expectedX)
	require.NoError(t, err)
	googleInputChunk := types.BigIntToChunkedBytes(googleBigInt, types.CIRCOM_BIGINT_N, types.CIRCOM_BIGINT_K)
	xInputChunk := types.BigIntToChunkedBytes(xBigInt, types.CIRCOM_BIGINT_N, types.CIRCOM_BIGINT_K)

	require.Equal(t, len(googleInputChunk), len(expectedGoogleBigInt))
	require.Equal(t, len(xInputChunk), len(expectedXBigInt))
	// Compare result with expected output
	if !reflect.DeepEqual(googleInputChunk, expectedGoogleBigInt) {
		t.Errorf("Expected output: %v, but got: %v", expectedGoogleBigInt, googleInputChunk)
	}
	if !reflect.DeepEqual(xInputChunk, expectedXBigInt) {
		t.Errorf("Expected output: %v, but got: %v", expectedXBigInt, xInputChunk)
	}
}
