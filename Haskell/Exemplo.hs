main = do
    print "Meu primeiro programa haskell"
    nome <- getLine
    print("Ola mundo " ++ nome)

adicionaDois :: Int -> Int
adicionaDois x=x+2

--função para calcular o dobro

dobro x=x+x

--Area do circulo
areaCirculo r= pi * r^2

--Area do triangulo
areaTriangulo a b c = a*b/2

--Menor de tres numero
menorTres x y z 
    | x<=y && x<=z=x
    | y<=z=y
    | otherwise =z

calc_imc peso altura
    |imc <=18.5 = "Abixo do peso"
    |imc <=25.0 = "Peso Ideal"
    |imc <=30.0 = "Acima do peso"
    |otherwise = "Muito acima do peso"
    where imc = peso/altura^2

num_par::Int -> Bool
num_par x=if mod x 2 == 0 then True else False

fatorial:: Integer -> Integer
fatorial 0=1
fatorial n=n*fatorial(n-1)