# language: en
# namespace: basic
@main
Feature: basic

Scenario: Page is visible
	When basic: i open the page
	Then basic: the page is visible
