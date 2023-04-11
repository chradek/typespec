[JS Api](../index.md) / ModelSpreadPropertyNode

# Interface: ModelSpreadPropertyNode

## Hierarchy

- [`BaseNode`](BaseNode.md)

  ↳ **`ModelSpreadPropertyNode`**

## Table of contents

### Properties

- [directives](ModelSpreadPropertyNode.md#directives)
- [docs](ModelSpreadPropertyNode.md#docs)
- [end](ModelSpreadPropertyNode.md#end)
- [flags](ModelSpreadPropertyNode.md#flags)
- [kind](ModelSpreadPropertyNode.md#kind)
- [parent](ModelSpreadPropertyNode.md#parent)
- [pos](ModelSpreadPropertyNode.md#pos)
- [symbol](ModelSpreadPropertyNode.md#symbol)
- [target](ModelSpreadPropertyNode.md#target)

## Properties

### directives

• `Optional` `Readonly` **directives**: readonly [`DirectiveExpressionNode`](DirectiveExpressionNode.md)[]

#### Inherited from

[BaseNode](BaseNode.md).[directives](BaseNode.md#directives)

___

### docs

• `Optional` `Readonly` **docs**: readonly [`DocNode`](DocNode.md)[]

#### Inherited from

[BaseNode](BaseNode.md).[docs](BaseNode.md#docs)

___

### end

• `Readonly` **end**: `number`

The ending position measured in UTF-16 code units from the start of the
full string. Exclusive.

#### Inherited from

[BaseNode](BaseNode.md).[end](BaseNode.md#end)

___

### flags

• `Readonly` **flags**: [`NodeFlags`](../enums/NodeFlags.md)

#### Inherited from

[BaseNode](BaseNode.md).[flags](BaseNode.md#flags)

___

### kind

• `Readonly` **kind**: [`ModelSpreadProperty`](../enums/SyntaxKind.md#modelspreadproperty)

#### Overrides

[BaseNode](BaseNode.md).[kind](BaseNode.md#kind)

___

### parent

• `Optional` `Readonly` **parent**: [`ModelStatementNode`](ModelStatementNode.md) \| [`ModelExpressionNode`](ModelExpressionNode.md)

#### Overrides

[BaseNode](BaseNode.md).[parent](BaseNode.md#parent)

___

### pos

• `Readonly` **pos**: `number`

The starting position of the ranger measured in UTF-16 code units from the
start of the full string. Inclusive.

#### Inherited from

[BaseNode](BaseNode.md).[pos](BaseNode.md#pos)

___

### symbol

• `Readonly` **symbol**: [`Sym`](Sym.md)

Could be undefined but making this optional creates a lot of noise. In practice,
you will likely only access symbol in cases where you know the node has a symbol.

#### Inherited from

[BaseNode](BaseNode.md).[symbol](BaseNode.md#symbol)

___

### target

• `Readonly` **target**: [`TypeReferenceNode`](TypeReferenceNode.md)