valor_projeto = float(input("Insira o valor total do Projeto: R$: "))
taxa_iss_municipal = valor_projeto * 0.04
taxa_icms_estadual = valor_projeto * 0.18
valor_projeto_final = taxa_iss_municipal + taxa_icms_estadual
print("O valor do projeto com ISS aplicado é: R$ ", "%.2f" % round(taxa_iss_municipal,2))
print("O valor do Projeto com ICMS aplicado é: R$ ", "%.2f" % round(taxa_icms_estadual,2))
print("O valor final do Projeto com todos os impostos aplicados é: R$ ", "%.2f" % round(valor_projeto_final,2))
