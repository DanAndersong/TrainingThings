package main

import (
	"errors"
	"fmt"
	"log"
)

func main() {
	message, err := enterTheClub(15)
	if err != nil {
		log.Fatal(err)
		return
	}
	fmt.Println(message)
}

func enterTheClub(age int) (string, error) {
	if age >= 18 {
		if age < 21 {
			return "Входите, алкоголь под запретом", nil
		}
		return "Входите", nil
	} else if age > 65 {
		return "Уверены что вам нужно в этот клуб?", nil
	}
	return "Вам нет 18-ти лет, вы не можеете войти", errors.New("too young person")
}
