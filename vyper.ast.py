class VyperNode:
    def __init__(source_code, pos):
        self.source_code = source_code
        self.lineno, self.col_offset = pos


class Name(VyperNode):
    pass


class Subscript(VyperNode):
    pass


class Index(VyperNode):
    pass


class arg(VyperNode):
    pass


class Tuple(VyperNode):
    pass


class FunctionDef(VyperNode):
    pass


class arguments(VyperNode):
    pass


class Import(VyperNode):
    pass


class Call(VyperNode):
    pass


class Str(VyperNode):
    pass


class Compare(VyperNode):
    pass


class Num(VyperNode):
    pass


class NameConstant(VyperNode):
    pass


class Attribute(VyperNode):
    pass


class BinOp(VyperNode):
    pass


class BoolOp(VyperNode):
    pass


class UnaryOp(VyperNode):
    pass


class List(VyperNode):
    pass


class Dict(VyperNode):
    pass


class Bytes(VyperNode):
    pass


class Add(VyperNode):
    pass


class Sub(VyperNode):
    pass


class Mult(VyperNode):
    pass


class Div(VyperNode):
    pass


class Mod(VyperNode):
    pass


class Pow(VyperNode):
    pass


class In(VyperNode):
    pass


class Gt(VyperNode):
    pass


class GtE(VyperNode):
    pass


class LtE(VyperNode):
    pass


class Lt(VyperNode):
    pass


class Eq(VyperNode):
    pass


class NotEq(VyperNode):
    pass


class And(VyperNode):
    pass


class Or(VyperNode):
    pass


class Not(VyperNode):
    pass


class USub(VyperNode):
    pass


class Expr(VyperNode):
    pass


class Pass(VyperNode):
    pass


class AnnAssign(VyperNode):
    pass


class Assign(VyperNode):
    pass


class If(VyperNode):
    pass


class Assert(VyperNode):
    pass


class For(VyperNode):
    pass


class AugAssign(VyperNode):
    pass


class Break(VyperNode):
    pass


class Continue(VyperNode):
    pass


class Return(VyperNode):
    pass


class Delete(VyperNode):
    pass


class stmt(VyperNode):
    pass


class ClassDef(VyperNode):
    pass


class ImportFrom(VyperNode):
    pass
